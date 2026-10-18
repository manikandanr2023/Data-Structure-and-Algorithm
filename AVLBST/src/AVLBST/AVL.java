package AVLBST;
import java.util.*;
public class AVL {
	BinaryNode root;
	public void insert(int value)
	{
		root=insert(root,value);
	}
	public BinaryNode insert(BinaryNode node,int value)
	{
		if(node==null)
		{
			BinaryNode tmp=new BinaryNode();
			tmp.height=1;
			tmp.value=value;
			return tmp;
		}
		else if(value<node.value)
		{
			node.Left=insert(node.Left,value);
		}
		else
		{
			node.Right=insert(node.Right,value);
		}
		
		
		node.height=1+Math.max(getHeight(node.Left), getHeight(node.Right));
		int balance=getBalance(node);

	    if (balance > 1 && value < node.Left.value) {
	      return rotateRight(node);
	    }

	    if (balance > 1 && value > node.Left.value) {
	      node.Left = rotateLeft(node.Left);
	      return rotateRight(node);
	    }

	    if (balance < -1 && value > node.Right.value) {
	      return rotateLeft(node);
	    }

	    if (balance < -1 && value < node.Right.value) {
	      node.Right = rotateRight(node.Right);
	      return rotateLeft(node);
	    }
		return node;
	}
	public int getHeight(BinaryNode node)
	{
		if(node==null)
		{
			return 0;
		}
		return node.height;
	}
	
	public int getBalance(BinaryNode node)
	{
		if(node==null)
		{
			return 0;
			
		}
		return getHeight(node.Left)-getHeight(node.Right);
	}
	public BinaryNode rotateRight(BinaryNode dnode)
	{
		BinaryNode newnode=dnode.Left;
		dnode.Left=dnode.Left.Right;
		newnode.Right=dnode;
		dnode.height=1+Math.max(getHeight(dnode.Left), getHeight(dnode.Right));
		newnode.height=1+Math.max(getHeight(newnode.Left), getHeight(newnode.Right));
		return newnode;
		
	}
	public BinaryNode rotateLeft(BinaryNode dnode)
	{
		BinaryNode newnode=dnode.Right;
		dnode.Right=dnode.Right.Left;
		newnode.Left=dnode;
		dnode.height=1+Math.max(getHeight(dnode.Left), getHeight(dnode.Right));
		newnode.height=1+Math.max(getHeight(newnode.Left), getHeight(newnode.Right));
		return newnode;
	}
	void levelOrder() {
	    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
	    queue.add(root);
	    while (!queue.isEmpty()) {
	      BinaryNode presentNode = queue.remove();
	      System.out.print(presentNode.value + " ");
	      if (presentNode.Left != null) {
	        queue.add(presentNode.Left);
	      }
	      if (presentNode.Right != null) {
	        queue.add(presentNode.Right);
	      }
	    }
	  }
	public BinaryNode deleteNode(BinaryNode node,int value)
	{
		if(node==null)
		{
			System.out.println("Not found");
		}
		if(node.value>value)
		{
			node.Left=deleteNode(node.Left,value);
		}
		else if(node.value<value)
		{
			node.Right=deleteNode(node.Right,value);
		}
		else {
			if(node.Left!=null&&node.Right!=null)
			{
				BinaryNode temp=node;
				BinaryNode minNodeRight=minimum(temp.Right);
				node.value=minNodeRight.value;
				node.Right=deleteNode(node.Right,minNodeRight.value);
			}
			else if(node.Left!=null)
			{
				node=node.Left;
			}
			else if(node.Right!=null)
			{
				node=node.Right;
			}
			else {
				node=null;
			}
		}
		int balance = getBalance(node);

	    if (balance > 1 && getBalance(node.Left) >= 0) {
	      return rotateRight(node);
	    }
	    if (balance > 1 && getBalance(node.Left) < 0) {
	      node.Left = rotateLeft(node.Left);
	      return rotateRight(node);
	    }
	    if (balance < -1 && getBalance(node.Right) <= 0) {
	      return rotateLeft(node);
	    }

	    if (balance < -1 && getBalance(node.Right) > 0) {
	      node.Right = rotateRight(node.Right);
	      return rotateLeft(node);
	    }

	    return node;
	}
	public BinaryNode minimum(BinaryNode node)
	{
		if(node.Left==null)
		{
		return node;	
		}
		else {
			return minimum(node.Left);
		}
	}
	
}
