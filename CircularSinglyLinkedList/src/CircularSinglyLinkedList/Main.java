package CircularSinglyLinkedList;

public class Main {

	public static void main(String args[])
	{
		CircularSinglyLinkedList CSL=new CircularSinglyLinkedList();
		CSL.InsertNode(10,0);
		CSL.InsertNode(20, 0);
		CSL.InsertNode(30, 0);
		CSL.InsertNode(40, 0);
		CSL.InsertNode(50, 0);
		CSL.InsertNode(51, 10);
		CSL.InsertNode(52, 10);
		CSL.InsertNode(53, 10);
		CSL.InsertNode(61, 1);
		CSL.InsertNode(62, 4);
		CSL.Traversal();
		CSL.SearchNode(62);
		CSL.DeleteNode(14);
		CSL.Traversal();
		
		
	}
	
}
