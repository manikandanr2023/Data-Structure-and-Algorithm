package graphList;

import java.util.*;
public class Main {
public static void main(String args[])
{
	ArrayList<graphNode> node=new ArrayList<>();
	node.add(new graphNode("A",0));
	node.add(new graphNode("B",1));
	node.add(new graphNode("C",2));
	node.add(new graphNode("D",3));
	node.add(new graphNode("E",4));
	node.add(new graphNode("F",5));
	node.add(new graphNode("G",6));

	graph g=new graph(node);
	g.addDirection(0,1);
	g.addDirection(0,2);
	g.addDirection(1,3);
	g.addDirection(1,6);
	g.addDirection(2,3);
	g.addDirection(2,4);
	g.addDirection(3,5);
	g.addDirection(4,5);
	g.addDirection(5,6);
	g.bfsforssspp(node.get(0));

	
}
}