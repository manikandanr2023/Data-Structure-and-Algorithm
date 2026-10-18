package BinarySearchTree;

public class Main {

	public static void main(String args[])
	{
		BinarySearchTree BST=new BinarySearchTree();
		BST.insert(40);
		BST.insert(10);
		BST.insert(20);
		BST.insert(30);
		BST.insert(5);
		BST.insert(15);
		BST.insert(50);
		BST.insert(45);
		BST.insert(60);
		BST.insert(55);
		BST.insert(70);
		BST.insert(65);
		BST.insert(80);
		BST.insert(62);
		BST.insert(67);
		System.out.println("Level Order Traversal");
		BST.levelOrder();
		System.out.println();
		System.out.println("PreOrder");
		BST.preOrder(BST.root);
		System.out.println();
		System.out.println("InOrder");
		BST.inOrder(BST.root);
		System.out.println();
		System.out.println("Post Order");
		BST.postOrder(BST.root);
		System.out.println();
		System.out.println("Search");
		BST.Search(BST.root,100);
		System.out.println();
		System.out.println("Minimum Node");
		BST.minimumNode(BST.root);
		System.out.println();
		System.out.println("Maximum Node");
		BST.maximumNode(BST.root);
		BST.deleteNode(BST.root, 60);
		System.out.println();
		System.out.println("Deleted node after");
		BST.levelOrder();
		
		
		

	}
}
