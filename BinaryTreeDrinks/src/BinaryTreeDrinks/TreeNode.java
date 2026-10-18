package BinaryTreeDrinks;

import java.util.ArrayList;

public class TreeNode {
public String data;
public ArrayList<TreeNode> children;
public TreeNode(String data)
{
	this.data=data;
	this.children=new ArrayList<TreeNode>();
}
public void addChild(TreeNode node)
{
	this.children.add(node);
}
public String print(int level)
{
	String str="";
	str=" ".repeat(level)+data+"\n";
	for(TreeNode Element:this.children)
	{
		str+=Element.print(level+1);
	}
return str;
}

}
