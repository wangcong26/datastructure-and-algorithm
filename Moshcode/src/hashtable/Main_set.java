package hashtable;

import java.util.HashSet;
import java.util.Set;

public class Main_set
{
	public static void main(String[] args)
	{
		Set<Integer> set = new HashSet<>();
		int[] numbers =
		{ 1, 3, 4, 5, 8 };
		for (int number : numbers)
			set.add(number);
		System.out.println(set);

		//////////////////////////////////////////
		// Question: find non-repeat char
		String word = "vveery good";
		char result = findFirstRepeatedChar(word);
		System.out.println(result);

	}

	public static char findFirstRepeatedChar(String str)
	{
		Set<Character> set = new HashSet<>();
		for (char ch: str.toCharArray())
		{
			if (set.contains(ch))
				return ch;
			else
				set.add(ch);
		}
		return Character.MIN_VALUE;
	}

}
