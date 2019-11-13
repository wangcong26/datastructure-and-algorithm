package stack;

import java.util.Stack;

public class BalancedString
{
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
		return ch == '[' || ch == '<' || ch == '{' || ch == '(';
	}

	private boolean isRightBracket(char ch)
	{
		return ch == ']' || ch == '>' || ch == ')' || ch == '}';
	}

	private boolean bracketMatch(char left, char right)
	{
		return (right == ')' && left != '(') || (right == ']' && left != '[') || (right == '>' && left != '<')
				|| (right == '}' && left != '{');
	}

}
