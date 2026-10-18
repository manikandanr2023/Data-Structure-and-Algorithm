package DoublyLinkedList;

public class DoublyLinkedList {
	
	public Node Head;
	public Node Tail;
	
	public void InsertSinglyNode(int NodeValue)
	{
		Node node=new Node();
		node.data=NodeValue;
		Head=node;
		Tail=node;
		return;
	}
		
	public int Size()
	{
		int index=1;
		Node TempNode=Head;
		while(TempNode.next!=null)
		{
			TempNode=TempNode.next;
			index++;
		}
		return index;
	}
	public void Traverse()
	{
		Node TempNode=Head;
		while(TempNode.next!=null)
		{
			System.out.print(TempNode.data+"->");
			TempNode=TempNode.next;
		}
		System.out.print(TempNode.data+"->");
	}
	public void InsertNode(int NodeValue,int Location)
	{
		Node node=new Node();
		node.data=NodeValue;
		if(Head==null)
		{
			InsertSinglyNode(NodeValue);
			return ;
		}
		else if(Location==0)
		{
			node.next=Head;
			Head.prev=node;
			Head=node;
			System.out.println("Node Inserted At Beginning");
			}
		else if(Location>Size())
		{
			Tail.next=node;
			node.prev=Tail;
			Tail=node;
			System.out.println("Node Inserted At End");
		}
		else {
			Node TempNode=Head;
			Node Previous=null;
			int index=0;
			while(index<Location)
			{
				Previous=TempNode;
				TempNode=TempNode.next;
				index++;
			}
			Previous.next=node;
			node.prev=Previous;
			TempNode.prev=node;
			node.next=TempNode;
			
			System.out.println("Node Inserted At Location Given Location");
		}
	}
	public void SearchNode(int NodeValue)
	{
		Node TempNode=Head;
		System.out.println();
		while(TempNode!=null)
		{
			if(NodeValue==TempNode.data)
			{
				System.out.println("Node Value Exist");
				return;
			}
				TempNode=TempNode.next;
			
		}
		System.out.println("Node Value Does not Exist");
		
	}
	public void DeleteNode(int Location)
	{
		Node TempNode=Head;
		if(Location==0)
		{
			Head=TempNode.next;
			TempNode.prev=null;
		}
		else if(Location>Size())
		{
			Tail=Tail.prev;
			Tail.next=null;
		}
		else {
			int index=0;
			Node Previous=null;
			while(index<Location)
			{
				Previous=TempNode;
				TempNode=TempNode.next;
				index++;
			}
			Previous.next=TempNode.next;
			TempNode.prev=Previous;
			
		}
			
		
		
	}
	public void ReverseTraversal() {
		Node TempNode=Tail;
		System.out.println();
		System.out.println("Reverse LinkedList");
		while(TempNode!=null)
		{
			System.out.print(TempNode.data+"->");
			TempNode=TempNode.prev;
		}
	}
	public void CheckPalindrom() {
		Node HeadTemp=Head;
		Node TailTemp=Tail;
		int Size=Size()/2;
		int index=0;
		int TotalCount=0;
		System.out.println();
		while(index<Size)
		{
			if(HeadTemp.data==TailTemp.data)
			{
				TotalCount++;
			}
			index++;
		}
		if(TotalCount==Size)
		{
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}
		
		
	}
	

}
