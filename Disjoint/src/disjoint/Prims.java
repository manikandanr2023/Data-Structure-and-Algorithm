package disjoint;
import java.util.*;
public class Prims {
	ArrayList<WeightedNode> nodeList=new ArrayList<>();
	ArrayList<UndirectedEdge> edgeList=new ArrayList<>();
	
	public Prims(ArrayList<WeightedNode> nodeList)
	{
		this.nodeList=nodeList;
	}
	public 	void addWeightedUndirectedEdge(int firstIndex,int secondIndex,int weight)
	{
		UndirectedEdge edge=new UndirectedEdge(nodeList.get(firstIndex),nodeList.get(secondIndex),weight);
		WeightedNode first=edge.first;
		WeightedNode second=edge.second;
		first.neighbors.add(second);
		second.neighbors.add(first);
		first.weightMap.put(second, weight);
		second.weightMap.put(first, weight);
		edgeList.add(edge);
	}
	public void prims(WeightedNode node)
	{
		for(int counter=0;counter<nodeList.size();counter++)
		{
			nodeList.get(counter).distance=Integer.MAX_VALUE;
		}
		node.distance=0;
		PriorityQueue<WeightedNode> queue=new PriorityQueue<>();
		queue.addAll(nodeList);
		while(!queue.isEmpty())
		{
			WeightedNode presentNode = queue.remove();
			for(WeightedNode neighbor:presentNode.neighbors)
			{
				if(queue.contains(neighbor))
				{
					if(neighbor.distance>presentNode.weightMap.get(neighbor))
					{
						neighbor.distance=presentNode.weightMap.get(neighbor);
						neighbor.parent=presentNode;
						queue.remove(neighbor);
						queue.add(neighbor);
					}
				}
			}
			int cost=0;
			for(WeightedNode nodeToCheck:nodeList)
			{
				System.out.println("Node"+nodeToCheck+" , key : "+nodeToCheck.distance+", Parent: "+nodeToCheck.parent);
				cost=cost+nodeToCheck.distance;
				
			}
			System.out.println("\n Total cost of MST:"+cost);
		}
	}
	
	
}
