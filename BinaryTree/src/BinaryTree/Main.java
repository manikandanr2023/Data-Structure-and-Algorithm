package BinaryTree;

public class Main {
	public static void main(String args[])
	{
		BinaryTreeLL BT=new BinaryTreeLL();
		BinaryTree BT1=new BinaryTree();
		BT1.value=1;
		BinaryTree BT2=new BinaryTree();
		BT2.value=2;
		BinaryTree BT3=new BinaryTree();
		BT3.value=3;
		BinaryTree BT4=new BinaryTree();
		BT4.value=4;
		BinaryTree BT5=new BinaryTree();
		BT5.value=5;
		BinaryTree BT6=new BinaryTree();
		BT6.value=6;
		BinaryTree BT7=new BinaryTree();
		BT7.value=7;
		BinaryTree BT8=new BinaryTree();
		BT8.value=8;
		BinaryTree BT9=new BinaryTree();
		BT9.value=9;
		BT.insertNode(BT1);
		BT.insertNode(BT2);
		BT.insertNode(BT3);
		BT.insertNode(BT4);
		BT.insertNode(BT5);
		BT.insertNode(BT6);
		BT.insertNode(BT7);
		BT.insertNode(BT8);
		BT.insertNode(BT9);
		BT.LevelOrder();
		System.out.println();
		System.out.println("PreOrder");
		BT.preOrder(BT1);
		System.out.println();
		System.out.println("InOrder");
		BT.inOrder(BT1);
		System.out.println();
		System.out.println("PostOrder");
		BT.postOrder(BT1);
		BT.search(9);
		BT.deepestNode();
		
		System.out.println("Delete Deepest Node");
		BT.LevelOrder();
		BT.deleteNode(5);
		BT.LevelOrder();
		
		
	}

}
