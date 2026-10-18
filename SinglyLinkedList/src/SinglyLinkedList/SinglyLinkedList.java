package SinglyLinkedList;

public class SinglyLinkedList {

	public Node Head;
	public Node Tail;
	public int Size=0;
	
	
	public void CreateHeadAndTailNode(int NodeValue)
	{
		Node node=new Node();
		node.data=NodeValue;
		node.next=null;
		Head=node;
		Tail=node;
		Size=1;
		return;
	}
	
	public void InsertNode(int NodeValue,int Location)
	{
		Node node=new Node();
		node.data=NodeValue;
		node.next=null;
		
		if(Head==null)
		{
		CreateHeadAndTailNode(NodeValue);
		return;
		}
		else if(Location==0)
		{
			node.next=Head;
			Head=node;
		}
		else if(Location>Size)
		{
			Tail.next=node;
			Tail=node;
		}
		else {
			Node TempNode=Head;
			Node Previous=null;
		int Index=0;
		while(Index<Location)
			{
			Previous=TempNode;
			TempNode=TempNode.next;
			
			Index++;
			}
			node.next=TempNode;
			Previous.next=node;
			int i=0;
			
		}
		Size++;
	}
	public void Traverse()
	{
		Node TempNode=Head;
		int Index=0;
		if(Head==null)
		{
			System.out.println("No Data Available");
		}
		else {
			
		while(TempNode!=null)
		{
			System.out.println(Index+" "+TempNode.data);
			TempNode=TempNode.next;
			Index++;
		}
		}
	}
	public void SearchNode(int nodeValue)
	{
		Node TempNode=Head;
		int index=0;
		while(TempNode!=null)
		{
			if(TempNode.data==nodeValue)
			{
				System.out.println("Data Found in the Index "+index);
				break;
			}
			TempNode=TempNode.next;
			index++;
			if(index==Size)
			{
				System.out.println("Data Not Found");
			}
		}
	}
	public void DeleteAllNode()
	{
		Head=null;
		Tail=null;
		System.out.println("Deleted All Node Successfully");
	}
	public int Size()
	{
		Node TempNode=Head;
		int index=1;
		while(TempNode.next!=null)
		{
			TempNode=TempNode.next;
			index++;
		}
		
		return index;
	}
	public void DeleteNode(int Value,int Location)
	{
		Node TempNode=Head;
		if(TempNode==null)
		{
			System.out.println("No Data Available");
		}
		else  if(Location==0){
			Head=TempNode.next;
			
		}
		else if(Location>=Size)
		{
			Tail=null;
			while(TempNode.next.next!=null)
			{
				TempNode=TempNode.next;
			}
			TempNode.next=null;
			Tail=TempNode;
		}
		else {
			Node Preview=null;
			Node nextNode=Head;
			int index=0;
			while(index<Location)
			{
				Preview=nextNode;
				nextNode=nextNode.next;
				
				index++;
			}
			Preview.next=nextNode.next;
			
		}
	}
	
}
