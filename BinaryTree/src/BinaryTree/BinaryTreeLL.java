package BinaryTree;
import java.util.*;
public class BinaryTreeLL {
public BinaryTree root;

public void insertNode(BinaryTree Node)
{
	if(root==null)
	{
		
		
		root=Node;
		
		return;
	}
	Queue<BinaryTree> BTQueue=new LinkedList<BinaryTree>();
	BTQueue.add(root);
	while(!BTQueue.isEmpty())
	{
		BinaryTree BTRemove=BTQueue.remove();
		if(BTRemove.Left==null)
		{
			BTRemove.Left=Node;
			break;
		}
		else if(BTRemove.Right==null)
		{
			BTRemove.Right=Node;
			break;
		}
		else {
			BTQueue.add(BTRemove.Left);
			BTQueue.add(BTRemove.Right);
		}
	}
}
public void LevelOrder()
{
	Queue<BinaryTree> BTQueue=new LinkedList<BinaryTree>();
	BTQueue.add(root);
	while(!BTQueue.isEmpty())
	{
		BinaryTree BTRemove=BTQueue.remove();
		System.out.print(BTRemove.value+" ");
		if(BTRemove.Left!=null)
		{
			BTQueue.add(BTRemove.Left);
		}
		if(BTRemove.Right!=null)
		{
			BTQueue.add(BTRemove.Right);
		}
	}
}
public void preOrder(BinaryTree Node)
{
	if(Node==null)
	{
		return;
	}
	System.out.print(Node.value+" ");
	preOrder(Node.Left);
	preOrder(Node.Right);
}

public void inOrder(BinaryTree Node)
{
	if(Node == null)
	{
		return ;
	}
	inOrder(Node.Left);
	System.out.print(Node.value+" ");
	inOrder(Node.Right);
}
public void postOrder(BinaryTree Node)
{
	if(Node==null)
	{
		return;
	}
	postOrder(Node.Left);
	postOrder(Node.Right);
	System.out.print(Node.value+" ");
}
public void search(int data)
{System.out.println();
	Queue<BinaryTree> queue=new LinkedList<BinaryTree>();
	queue.add(root);
	while(!queue.isEmpty())
	{
		BinaryTree BTRemove=queue.remove();
		if(BTRemove.value==data)
		{
			System.out.println("Element found "+data);
			return;
		}
		else {
			if(BTRemove.Left!=null)
			{
				queue.add(BTRemove.Left);
			}
			if(BTRemove.Right!=null)
			{
				queue.add(BTRemove.Right);
			}
		}
	}
	System.out.println("Element not found ");
}
public int deepestNode()
{
	System.out.println();
	Queue<BinaryTree> queue=new LinkedList<>();
	queue.add(root);
	int lastValue=0;
	while(!queue.isEmpty())
	{
		BinaryTree tmp=queue.remove();
		lastValue=tmp.value;
		if(tmp.Left!=null)
		{
			queue.add(tmp.Left);
		}
		if(tmp.Right!=null)
		{
			queue.add(tmp.Right);
		}
	}
	System.out.println("Deepest Value "+lastValue);
	return lastValue;
}
public void deleteDeepestNode()
{
	Queue<BinaryTree> BT=new LinkedList<BinaryTree>();
	BT.add(root);
	BinaryTree present=null,previous=null;
	while(!BT.isEmpty())
	{
		previous=present;
		present=BT.remove();
		if(present.Left==null)
		{
			previous.Right=null;
			return;
		}
		else if(present.Right==null)
		{
			previous.Left=null;
			return;
		}
		BT.add(present.Left);
		BT.add(present.Right);
	}
}
public void deleteNode(int value)
{
	System.out.println();
	Queue<BinaryTree> BT=new LinkedList<BinaryTree>();
	BT.add(root);
	while(!BT.isEmpty())
	{
		BinaryTree temp=BT.remove();
		if(temp.value==value)
		{
			temp.value=deepestNode();
			deleteDeepestNode();
			System.out.println("Node deleted Successfully"+value);
			return;
		}
		else {
			if(temp.Left!=null)
			{
				BT.add(temp.Left);
			}
			if(temp.Right!=null)
			{
				BT.add(temp.Right);
			}
		}
	}
	System.out.println("Node Not deleted Successfully");
}

}
