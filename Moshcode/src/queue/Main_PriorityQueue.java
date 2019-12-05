package queue;

import java.util.PriorityQueue;

public class Main_PriorityQueue
{
	public static void main(String[] args)
	{
		PriorityQueue<Integer> queue1 = new PriorityQueue<Integer>();
		queue1.add(5);
		queue1.add(1);
		queue1.add(3);
		queue1.add(2);

		// already sorted
		while (!queue1.isEmpty())
			System.out.println(queue1.remove());

		// priority queue
		// [1,3,5,7]
		// 0 1 2 3

		//////////////////////////////////////////////////
		// Below is custom priorityqueue
		PriorityQueueShawn queue = new PriorityQueueShawn();
		queue.add(5);
		queue.add(3);
		queue.add(6);
		queue.add(1);
		queue.add(4);

		System.out.println(queue);

		while (!queue.isEmpty())
			System.out.println(queue.remove());
	}
}















