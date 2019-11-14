package stack;

import java.util.Stack;

public class Main
{

	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		int top = stack.pop();
		System.out.println(stack.peek());

		StringReverser reverser = new StringReverser();
		// String test = null; null case
		String test = "abcd";
		String test_reverse = reverser.reverse(test);
		System.out.println(test_reverse);

		// Test the balanced string
		// Edge cases
		// (, ((), )(
		String str = "{1+2>";
		BalancedString exp = new BalancedString();
		boolean result = exp.balance(str);
		System.out.println(result);

		// Test Stack class
		MyStackClass stack_test = new MyStackClass();
		stack_test.push(100);
		stack_test.push(200);
		stack_test.push(300);
		stack_test.push(400);
		stack_test.push(500);
		//stack_test.push(600); stack overflow because we set size of the stack to be 5
		System.out.println(stack_test);
		System.out.println(stack_test.pop());
		System.out.println(stack_test.pop());
		System.out.println(stack_test.peek());
	}

}
