package queue;

import java.util.Arrays;

public class ArrayQueue
{

	private int rear;
	private int front;
	private int count;
	private int[] items;

	public ArrayQueue(int capacity)
	{
		items = new int[capacity];
	}

	public void enqueue(int num)
	{
		if (count == items.length)
			throw new IllegalStateException();

		items[rear++] = num;
		count++;

	}

	public int dequeue()
	{
		int item = items[front];
		items[front++] = 0;
		count--;
		return item;
	}

	public String toString()
	{
		String result = Arrays.toString(items);
		return result;
	}
}
