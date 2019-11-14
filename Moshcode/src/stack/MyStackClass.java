package stack;

import java.util.Arrays;

public class MyStackClass
{
	// use count to control the element in the array
	private int count = 0;
	private int[] array = new int[5];

	public MyStackClass()
	{

	}

	public void push(int input)
	{
		if (count == array.length)
			throw new StackOverflowError();

		array[count++] = input;
	}

	public int pop()
	{
		if (count == 0)
			throw new IllegalStateException();

		// Count minus 1 first, then grab the number because count is the index
		return array[--count];
	}

	@Override
	public String toString()
	{
		// copy only from 0 to count
		int[] result = Arrays.copyOfRange(array, 0, count);
		System.out.println(count);
		return Arrays.toString(result);
	}

	public int peek()
	{
		if (count == 0)
			throw new IllegalStateException();
		return array[count - 1];
	}

}
