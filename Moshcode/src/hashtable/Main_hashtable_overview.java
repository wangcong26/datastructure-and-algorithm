package hashtable;

import java.util.HashMap;
import java.util.Map;

public class Main_hashtable_overview
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// key: employee number
		// value: name (string)
		// Map is an interface; HashMap is an implementation
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Mosh");
		map.put(2, "Wang");
		map.put(3, "Mary");
		map.put(3, "Marianne");
		map.put(null, null);
		map.remove(null);// remove key
		System.out.println(map);

		String name = map.get(3);
		System.out.println(name);

		map.containsKey(3); // O(1)
		map.containsValue("Mosh"); // O(n)

		for (Integer item : map.keySet())
		{
			System.out.println(item);
		}

		for (Map.Entry<Integer, String> entry : map.entrySet())
		{
			System.out.println(entry);
		}
	}

}
