package CircularSinglyLinkedList;

public class CircularSinglyLinkedList {
public Node Head;
public Node Tail;

public int Size()
{
	Node TempNode=Head;
	int index=1;
	while(TempNode.next!=Head)
	{
		TempNode=TempNode.next;
		index++;
		
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
	}
	else if(Location==0)
	{
		node.next=Head;
        Head=node;
        Tail.next=Head;
	}
	else if(Location>Size())
	{
		Tail.next=node;
		Tail.next.next=Head;
		Tail=node;
		
	}
	else {
		Node TempNode=Head;
		int index=0;
		Node Previous=null;
		while(index<Location)
		{
		Previous=TempNode;
		TempNode=TempNode.next;
		index++;
		}
		node.next=TempNode;
		Previous.next=node;
		
		
		
	}
}

public void Traversal()
{
	Node TempNode=Head;
	while(TempNode.next!=Head)
	{
		System.out.print(TempNode.data+"->");
		TempNode=TempNode.next;
	}
	System.out.print(TempNode.data+"->");
}
public void SearchNode(int NodeValue)
{
	Node TempNode=Head;
	System.out.println();
	while(TempNode.next!=Head)
	{
		if(TempNode.data==NodeValue)
		{
			
			System.out.println("Node Data Exist");
			return ;
		}
		TempNode=TempNode.next;
		
	}
	
	
	System.out.println("Node Data Does Not Exist");
}
public void DeleteNode(int Location)
{
	Node TempNode=Head;
	if(Location==0)
	{
		TempNode=TempNode.next;
		Tail.next=TempNode;
		Head=TempNode;
		System.out.println("Deletion At the First Node");
	}
	else if(Location>Size())
	{
		while(TempNode.next.next!=Head)
		{
			TempNode=TempNode.next;
		}
		TempNode.next=Head;
		System.out.println("Deletion At the Last Node");
	
	}
	else {
		
		int index=0;
		Node Previous=null;
		while(index<Location)
		{Previous=TempNode;
			TempNode=TempNode.next;
			index++;
			
		}
		Previous.next=TempNode.next;
		
	}
}

}



