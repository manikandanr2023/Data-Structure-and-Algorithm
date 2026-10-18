package DoublyCircularSinglyLinkedList;

public class Main {
public static void main(String args[])
{
	DoublyCircularSinglyLinkedList DCSLL=new DoublyCircularSinglyLinkedList();
	DCSLL.InsertNode(1,0);
	DCSLL.InsertNode(2,0);
	DCSLL.InsertNode(3,0);
	DCSLL.InsertNode(4,0);
	DCSLL.InsertNode(5,0);
	DCSLL.InsertNode(6,0);
	DCSLL.InsertNode(7,100);
	DCSLL.InsertNode(8,100);
	DCSLL.InsertNode(9,100);
	DCSLL.Traversal();
	DCSLL.InsertNode(10,1);
	DCSLL.Traversal();
	DCSLL.InsertNode(11,2);
	DCSLL.Traversal();
	DCSLL.SearchNode(1);
	System.out.println("Delete Node at Middle");
	DCSLL.DeleteNode(2);
	DCSLL.Traversal();
}
}
