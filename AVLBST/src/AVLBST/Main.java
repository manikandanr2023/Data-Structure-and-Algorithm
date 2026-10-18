package AVLBST;

public class Main {
	public static void main(String args[])
	{
		AVL avl=new AVL();
		int[] arr= {30,25,35,20,15,5,10,50,60,70};
		for(int i=0;i<arr.length;i++)
		{
			avl.insert(arr[i]);
		}
	
		
		
		
		
		
		avl.levelOrder();
		avl.deleteNode(avl.root, 15);
		System.out.println();
		avl.levelOrder();
		
	}

}
