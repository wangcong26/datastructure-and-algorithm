package binarytree;

public class TreeShawn
{
	private class Node
	{
		private int value;
		private Node leftChild;
		private Node rightChild;

		public Node(int value)
		{
			this.value = value;
		}
	}

	private Node root;

	public void insert(int value)
	{
		if (root == null)
		{
			root = new Node(value);
			return;
		}
	}

	@Override
	public String toString()
	{
		return ("Node=" + root.value);
	}
	
	
}
