package queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main
{
	public static void main(String[] args)
	{
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		// int front = queue.remove();
		System.out.println(queue);
		reverse(queue);
		// System.out.println(queue);

		// Test ArrayQueue
		ArrayQueue queue_test = new ArrayQueue(5);
		queue_test.enqueue(100);
		queue_test.enqueue(200);
		queue_test.enqueue(300);
		int front = queue_test.dequeue();
		System.out.println(queue_test);
		queue_test.dequeue();
		System.out.println(queue_test);
	}

	public static void reverse(Queue<Integer> queue)
	{
		Stack<Integer> stack = new Stack<>();

		while (!queue.isEmpty())
		{
			stack.push(queue.remove());
		}

		System.out.println(stack);

		while (!stack.isEmpty())
		{
			queue.add(stack.pop());
		}

		System.out.println(queue);
	}

}
