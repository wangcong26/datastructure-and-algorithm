package hashtable;

public class Main_HashTableShawn
{

	public static void main(String[] args)
	{
		HashTableShawn table = new HashTableShawn();
		table.put(6, "A");// 1
		table.put(8, "B"); // 3 
		table.put(11, "C"); // 1
		table.put(6, "A+");
		table.remove(60);// exception
		System.out.println("Done");
		System.out.println(table.get(10));

	}

}
