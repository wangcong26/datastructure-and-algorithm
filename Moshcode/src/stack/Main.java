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

	}

}
