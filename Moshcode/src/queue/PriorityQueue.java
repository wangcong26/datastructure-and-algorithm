package queue;

public class PriorityQueue
{
	private int[] items = new int[5];
	private int count;

	public void add(int item)
	{
		for (int i = count - 1; i >= 0; i--)
		{
			if (items[i] > item)
			{
				items[i + 1] = items[i];
			} 
			else 
				break;
		}

	}

}
