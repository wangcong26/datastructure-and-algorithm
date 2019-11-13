package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedString
{
	private final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
	private final List<Character> rightBrackets = Arrays.asList(')', '>', ']', '{');

	public boolean balance(String input)
	{
		Stack<Character> stack = new Stack<>();

		for (char ch : input.toCharArray())
		{
			if (isLeftBracket(ch))
				stack.push(ch);

			if (isRightBracket(ch))
			{
				if (stack.empty())
					return false; // if string like this: )xhid(, then it's not balanced.
				char top = stack.pop();

				if (bracketMatch(top, ch))
					return false;
			}
		}

		return stack.empty();
	}

	private boolean isLeftBracket(char ch)
	{
		return leftBrackets.contains(ch);
	}

	private boolean isRightBracket(char ch)
	{
		return rightBrackets.contains(ch);
	}

	private boolean bracketMatch(char left, char right)
	{
		return (right == ')' && left != '(') || (right == ']' && left != '[') || (right == '>' && left != '<')
				|| (right == '}' && left != '{');
	}

}
