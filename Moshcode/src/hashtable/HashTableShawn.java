package hashtable;

import java.util.LinkedList;

public class HashTableShawn
{

	private class Entry
	{
		private int key;
		private String value;

		public Entry(int k, String v)
		{
			this.key = k;
			this.value = v;
		}
	}

	// array of Entry
	private LinkedList<Entry>[] entries = new LinkedList[5];

	public void put(int key, String value)
	{
		// obtain hashcode
		int index = hash(key);

		if (entries[index] == null)
			entries[index] = new LinkedList<>();

		LinkedList<Entry> bucket = entries[index];
		for (Entry entry : bucket)
		{
			if (entry.key == key)
			{
				entry.value = value;
				return;
			}

		}

		bucket.addLast(new Entry(key, value));

	}

	private int hash(int key)
	{
		return key % entries.length;
	}

}