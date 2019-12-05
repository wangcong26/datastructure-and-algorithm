package hashtable;

import java.util.HashMap;
import java.util.Map;

public class Main_find_nonrepeat
{
	public static void main(String[] args)
	{
		// find first non-repeated character
		// a green apple
		// a=2
		// =2
		// g=1
		String test = "ggood moorning";
		char result = nonrepeat(test);
		System.out.println(result);
	}

	public static char nonrepeat(String word)
	{
		Map<Character, Integer> map = new HashMap<>();
//		for (Character s : word.toCharArray())
//		{
//			if (map.containsKey(s))
//			{
//				map.put(s, map.get(s) + 1);
//			} else
//				map.put(s, 1);
//		}

		char[] chars = word.toCharArray();
		for (Character s : chars)
		{
			int count = map.containsKey(s) ? map.get(s) : 0;
			map.put(s, count + 1);
		}

		for (Character s : chars)
		{
			if (map.get(s) == 1)
			{
				return s;
			}
		}
		return Character.MIN_VALUE;
	}

}
