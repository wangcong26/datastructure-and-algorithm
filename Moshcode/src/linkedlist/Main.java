package linkedlist;

import java.util.Arrays;

public class Main
{

	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		System.out.println(list.size());

		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		int[] array = list.toArray();
		Arrays.toString(array);
		System.out.println(Arrays.toString(array));
		// System.out.println(list.indexOf(40));
		// System.out.println(list.contains(10));

		// list.removeFirst();
		list.removeLast();
		System.out.println(list.contains(30));
		System.out.println(list.size());

	}

}
