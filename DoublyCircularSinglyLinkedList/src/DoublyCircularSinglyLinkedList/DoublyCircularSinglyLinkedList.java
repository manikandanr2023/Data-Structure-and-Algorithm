package DoublyCircularSinglyLinkedList;

public class DoublyCircularSinglyLinkedList {

	public Node Head;
	public Node Tail;
	
	public void Traversal()
	{System.out.println();
		Node TempNode=Head;
		
		while(TempNode.next!=Head)
		{
			System.out.print(TempNode.data+"->");
			TempNode=TempNode.next;
		}
		System.out.print(TempNode.data+"->");
	}
	
	public int Size() {
		Node TempNode=Head;
		int index=1;
		while(TempNode.next!=Head)
		{
			index++;
			TempNode=TempNode.next;
		}
		return index;
		
	}
	public void InsertSingleNode(int NodeValue)
	{
		Node node=new Node();
		node.data=NodeValue;
		Head=node;
		Tail=node;
		return ;
	}
	public void InsertNode(int NodeValue,int Location)
	{
		Node node=new Node();
		node.data=NodeValue;
		if(Head==null)
		{
			InsertSingleNode(NodeValue);
			return ;
		}
		else if(Location==0)
		{
			node.next=Head;
			Head.prev=node;
			node.prev=Tail;
			Tail.next=node;
			Head=node;
		}
		else if(Location>Size())
		{
			Tail.next=node;
			node.prev=Tail;
			node.next=Head;
			Head.prev=node;
			Tail=node;
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
			node.next=TempNode;
			TempNode.prev=node;
		}
	}
	public void SearchNode(int NodeValue)
	{
		System.out.println();
		Node TempNode=Head;
		while(TempNode.next!=Head)
		{
			if(TempNode.data==NodeValue)
			{
				System.out.println("Node Value Found");
				return;
			}
			TempNode=TempNode.next;
		}
		System.out.println("Node Value Not Found");
	}
	public void DeleteNode(int Location)
	{
		Node TempNode=Head;
		if(Location==0)
		{
			Head=TempNode.next;
			Tail.next=Head;
		
			
		}
		else if(Location>Size())
		{
			Head.prev=Tail.prev;
			Tail.prev.next=Head;
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
	
}