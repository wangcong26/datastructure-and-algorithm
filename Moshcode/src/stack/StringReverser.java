package stack;

import java.util.Stack;

public class StringReverser
{
	public String reverse(String input)
	{
		if (input == null)
		{
			throw new IllegalArgumentException();
		}

		Stack<Character> stack = new Stack<>();

		// One way to do it is to loop and concatenate character
//		for (int i = 0; i < input.length(); i++)
//		{
//			stack.push(input.charAt(i));
//		}

		// Better to do it is to use StringBuffer

		for (char ch : input.toCharArray())
		{
			stack.push(ch);
		}

		StringBuffer reversed = new StringBuffer();
		while (!stack.empty())
		{
			reversed.append(stack.pop());
		}
		return reversed.toString();
	}

}
