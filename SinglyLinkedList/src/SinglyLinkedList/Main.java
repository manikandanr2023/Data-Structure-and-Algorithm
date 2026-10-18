package SinglyLinkedList;

public class Main {
	public static void main(String args[])
	{
		SinglyLinkedList sll=new SinglyLinkedList();
sll.InsertNode(10, 0);
sll.InsertNode(20, 0);
sll.InsertNode(30, 0);
sll.InsertNode(40, 7);
sll.InsertNode(50, 0);
sll.InsertNode(60, 2);
sll.InsertNode(70, 2);
System.out.println("Size"+sll.Size());
sll.Traverse();
sll.SearchNode(100);
sll.DeleteNode(10,2);

sll.Traverse();
System.out.println("Size"+sll.Size());
sll.DeleteAllNode();
	}


}
