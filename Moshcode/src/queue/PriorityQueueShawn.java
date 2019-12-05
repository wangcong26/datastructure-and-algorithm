package queue;

import java.util.Arrays;

public class PriorityQueueShawn
{
	private int[] items = new int[5];
	private int count;

	public void add(int item)
	{
		if (isFull())
			throw new IllegalStateException();

		int i = shiftItemsToInsert(item);
		items[i] = item;
		count++;
	}

	public boolean isFull()
	{
		return count == items.length;
	}

	private int shiftItemsToInsert(int item)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int shiftItems(int item)
	{
		// start from the end of the queue, shift items
		int i;
		for (i = count - 1; i >= 0; i--)
		{
			if (items[i] > item)
				items[i + 1] = items[i];
			else
				break;
		}
		return i + 1;
	}

	public int remove()
	{
		if (isEmpty())
			throw new IllegalStateException();

		return items[--count];
	}

	public boolean isEmpty()
	{
		return count == 0;
	}

	@Override
	public String toString()
	{
		return Arrays.toString(items);
	}

}
