package DoublyLinkedList;

public class Main {

public static void main(String args[])
{
	DoublyLinkedList DLL=new DoublyLinkedList();
	DLL.InsertNode(10, 0);
	DLL.InsertNode(11, 0);
	DLL.InsertNode(12, 0);
	DLL.InsertNode(13, 0);
	DLL.InsertNode(14, 0);
	DLL.InsertNode(5, 100);
	DLL.InsertNode(4, 100);
	DLL.InsertNode(3, 100);
	DLL.InsertNode(2, 100);
	DLL.InsertNode(1, 100);
	DLL.InsertNode(6, 5);
	DLL.Traverse();
	DLL.SearchNode(6);
	DLL.DeleteNode(1);
	DLL.Traverse();
	DLL.ReverseTraversal();
	DLL.CheckPalindrom();
	
}
}
