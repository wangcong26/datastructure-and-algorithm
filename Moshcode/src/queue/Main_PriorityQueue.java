package queue;

import java.util.PriorityQueue;

public class Main_PriorityQueue
{
	public static void main(String[] args)
	{
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(5);
		queue.add(1);
		queue.add(3);
		queue.add(2);
		
		// already sorted
		while(!queue.isEmpty())
			System.out.println(queue.remove());
	}

	// priority queue
	// [1,3,5,7]
	//  0 1 2 3
	
}
