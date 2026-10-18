package Disjoint;
import java.util.*;
public class Main {

	public static void main(String args[])
	{
		ArrayList<WeightedNode> nodeList=new ArrayList<>();
		nodeList.add(new WeightedNode("A", 0));
		nodeList.add(new WeightedNode("B",0));
		nodeList.add(new WeightedNode("C",0));
		nodeList.add(new WeightedNode("D",0));
		DisjointSet.makeSet(nodeList);
		WeightedNode firstNode=nodeList.get(0);
		WeightedNode secondNode=nodeList.get(1);
		DisjointSet output=DisjointSet.findSet(secondNode);
		output.printAllNodesofThisSet();
		DisjointSet.union(firstNode, secondNode);
		output=DisjointSet.findSet(secondNode);
		output.printAllNodesofThisSet();
		
	}
}
