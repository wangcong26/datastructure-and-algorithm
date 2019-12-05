package queue;

public class Main_Two_Stack
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		QueueWithTwoStacks queue = new QueueWithTwoStacks();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		int first = queue.dequeue();

		System.out.println(first);
	}

}
