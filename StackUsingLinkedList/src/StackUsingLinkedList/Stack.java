package StackUsingLinkedList;

public class Stack {
	public Node Head;

	public int Size()
	{
		Node TempNode=Head;
		int index=0;
		while(TempNode==null)
		{
			TempNode=TempNode.next;
			index++;
		}
		return index;
	}
	public boolean isEmpty()
	{
		if(Head==null)
		{
			return true;
		}
		return false;
		
		
	}
	public void push(int ElementValue)
	{
		Node node=new Node();
		node.data=ElementValue;
		node.next=Head;
		Head=node;
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			
		}
		else {
			System.out.println("Popped Element"+Head.data);
			Node TempNode=Head.next;
			Head=TempNode;
		}
	}
	public void peek()
	{
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			
		}
		else {
			System.out.println("Peek Element"+Head.data);
		}
	}

}
