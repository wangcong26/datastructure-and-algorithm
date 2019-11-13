package linkedlist;

import java.util.NoSuchElementException;

public class LinkedList
{
	private class Node
	{
		private int value;
		private Node next;

		public Node(int value)
		{
			this.value = value;
		}
	}

	private Node first;
	private Node last;
	private int size;

	// addFirst
	// addLast
	// deleteFirst
	// deleteLast
	// contains
	// indexOf
	public void addLast(int item)
	{
		Node node = new Node(item);

		if (isEmpty())
		{
			first = last = node;
		} else
		{
			last.next = node;
			last = node;
		}

		size++;
	}

	public void addFirst(int item)
	{
		Node node = new Node(item);

		if (isEmpty())
		{
			first = last = node;
		} else
		{
			node.next = first;
			first = node;
		}

		size++;
	}

	public int indexOf(int item)
	{
		int index = 0;
		Node current = first;
		while (current != null)
		{
			if (current.value == item)
			{
				return index;
			}

			current = current.next;
			index++;
		}
		return -1;
	}

	public boolean contains(int item)
	{
		return indexOf(item) != -1;

	}

	public void removeFirst()
	{
		// [10->20->30]
		// first -> 20
		if (isEmpty())
		{
			throw new NoSuchElementException();
		}

		if (first == last)
		{
			first = last = null;
			return;
		}

		Node second = first.next;
		first.next = null;
		first = second;

		size--;
	}

	public void removeLast()
	{
		if (isEmpty())
			throw new NoSuchElementException();

		if (first == last)
		{
			first = last = null;
		} else
		{
			Node previous = getPrevious(last);
			last = previous;
			last.next = null;
		}
		size--;
	}

	private Node getPrevious(Node node)
	{
		Node current = first;
		while (current != null)
		{
			if (current.next == node)
				return current;
			current = current.next;
		}
		return null;
	}

	private boolean isEmpty()
	{
		return first == null;
	}

	public int size()
	{

		return size;
	}

	public int[] toArray()
	{
		int[] array = new int[size];
		Node current = first;
		int index = 0;
		while (current != null)
		{
			array[index++] = current.value;
			current = current.next;
		}
		return array;
	}

	// reverse a linkedList
	public void reverse()
	{
		Node previous = first;
		Node current = first.next;

		while (current != null)
		{
			Node next = current.next;
			current.next = previous;

			previous = current;
			current = next;
		}

		last = first;
		last.next = null;
		first = previous;
	}

	public int getKthFromTheEnd(int k)
	{
		if (isEmpty())
			throw new IllegalStateException();
		Node begin = this.first;
		Node end = this.first;

		int distance = k - 1;

		for (int i = 0; i < distance; i++)
		{
			end = end.next;
			if (end == null)
				throw new IllegalArgumentException();
		}

		while (end != this.last)
		{
			begin = begin.next;
			end = end.next;
		}

		return begin.value;
	}

}
