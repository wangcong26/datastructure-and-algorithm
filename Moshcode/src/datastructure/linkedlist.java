package datastructure;

import java.util.LinkedList;

public class linkedlist
{

	public static void main(String[] args)
	{

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		System.out.println(list);
		// list.removeLast();
		// list.removeFirst();
		System.out.println(list.contains(10));
		System.out.println(list.indexOf(10));
		System.out.println(list.size());
		// list.toArray();
		Object[] array = list.toArray();
		for (Object obj : array)
		{
			System.out.println(obj);
		}

		// alternative method
		Integer[] array2 = new Integer[list.size()];
		array2 = list.toArray(array2);
		for (Integer x : array2)
		{
			System.out.println(x);
		}

	}
}
