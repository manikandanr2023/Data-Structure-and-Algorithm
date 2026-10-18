package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;



public class BinarySearchTree {

	public BinaryTree root;
	
	public BinaryTree insert(BinaryTree node,int value)
	{
		if(node==null)
		{
			BinaryTree BT=new BinaryTree();
			BT.value=value;
			return BT;
		}
		else if(node.value>=value)
		{
			node.Left=insert(node.Left,value);
			return node;
		}
		else
		{
			node.Right=insert(node.Right,value);
			return node;
		}

		
	}
	public void insert(int value)
	{
		root=insert(root,value);
	}
	public void levelOrder()
	{
		Queue<BinaryTree> BTqueue=new LinkedList<>();
		BTqueue.add(root);
		while(!BTqueue.isEmpty())
		{
			BinaryTree Emp=BTqueue.remove();
			System.out.print(Emp.value+" ");
			if(Emp.Left!=null)
			{
				BTqueue.add(Emp.Left);
			
			
			}
			if(Emp.Right!=null)
			{
				BTqueue.add(Emp.Right);
				
			}
		}
	}
	public void preOrder(BinaryTree root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.value+" ");
		preOrder(root.Left);
		preOrder(root.Right);
	}
	public void postOrder(BinaryTree root)
	{
		if(root==null)
		{
			return;
		}
		postOrder(root.Left);
		postOrder(root.Right);
		System.out.print(root.value+" ");
	}
	public void inOrder(BinaryTree root)
	{
		if(root==null)
		{
			return;
		}
		inOrder(root.Left);
		System.out.print(root.value+" ");
		inOrder(root.Right);
	}
	public void Search(BinaryTree root,int value)
	{
		if(root==null)
		{
			System.out.println("Value not found in Binary Search Tree "+value);
			return ;
	
		}
		if(root.value==value)
		{
			System.out.println("Value found in Binary Search Tree "+root.value);
			return ;
		}
		else if(root.value>value)
		{
			 Search(root.Left,value);
		
		}
		else
		{
			 Search(root.Right,value);
			
		}
	}
	public BinaryTree minimumNode(BinaryTree root)
	{
		if(root.Left==null)
		{
			System.out.println(root.value);
			return root;
		}
		else {
			return minimumNode(root.Left);
		}
	}
	public void maximumNode(BinaryTree root)
	
	{
		if(root.Right==null)
		{
			System.out.println(root.value);
			return;
		}
		else {
			maximumNode(root.Right);
		}
	}
	public BinaryTree deleteNode(BinaryTree root,int value)
	{
		if(root==null)
		{
			System.out.println("Value not found to delete "+value);
			return null;
		}
		else if(root.value>value)
		{
			root.Left=deleteNode(root.Left,value);
		}
		else if(value>root.value)
		{
			root.Right=deleteNode(root.Right,value);
		}
		else {
			if(root.Left!=null&&root.Right!=null)
		{
				BinaryTree temp=root;
				BinaryTree minimumNodeForRight=minimumNode(root.Right);
				root.value=minimumNodeForRight.value;
				root.Right=deleteNode(root.Right,minimumNodeForRight.value);
		}
		else if(root.Left!=null)
				{root=root.Left;
		}
		else if(root.Right!=null)
		{
			root=root.Right;
		}
		else {
			root= null;
		}
	}
		return root;
	
}
}