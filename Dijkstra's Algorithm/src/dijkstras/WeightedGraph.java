package dijkstras;

import java.util.*;
public class WeightedGraph {
	ArrayList<WeightedNode> nodeList=new ArrayList<>();
	public WeightedGraph(ArrayList<WeightedNode> nodeList)
	{
		this.nodeList=nodeList;
	}
	
	public void addWeightedEdge(int i,int j,int distance)
	{
		WeightedNode first=nodeList.get(i);
		WeightedNode second=nodeList.get(j);
		first.neighbour.add(second);
		first.weighted.put(second, distance);
	}
	//Dijkstra ALgorithm
	public void dijkstra(WeightedNode node)
	{
		PriorityQueue<WeightedNode> queue=new PriorityQueue<WeightedNode>();
		node.distance=0;
		queue.addAll(nodeList);
		
		while(!queue.isEmpty())
		{
			WeightedNode CurrentNode=queue.remove();
			for(WeightedNode nei:CurrentNode.neighbour)
			{
				if(queue.contains(nei))
				{
				if(nei.distance>CurrentNode.distance+CurrentNode.weighted.get(nei))
				{
					nei.distance=CurrentNode.distance+CurrentNode.weighted.get(nei);
					nei.parent=CurrentNode;
					queue.remove(nei);
					queue.add(nei);
				}
				}
			}
		}

	
	
	
	for(WeightedNode p:nodeList)
	{
	System.out.print("Node"+p+", distance "+p.distance+", Path :");
	pathPrint(p);
	System.out.println();
	}
	}
	public void pathPrint(WeightedNode p)
	{
		if(p.parent!=null)
		{
			pathPrint(p.parent);
		}
		System.out.print(p.name+" ");
	}
	// Bellmans Ford Algorithm
	void bellmanFord(WeightedNode sourceNode)
	{
		sourceNode.distance=0;
		for(int i=0;i<nodeList.size();i++)
		{
			for(WeightedNode currentNode:nodeList)
			{
				for(WeightedNode neighbor:currentNode.neighbour)
				{
					if(neighbor.distance>currentNode.distance+currentNode.weighted.get(neighbor))
					{
						neighbor.distance=currentNode.distance+currentNode.weighted.get(neighbor);
					}
				}
			}
		}
		System.out.println("Checking Negative Cycle");
		for(WeightedNode currentNode:nodeList)
		{
			for(WeightedNode neighbor:currentNode.neighbour)
			{
				if(neighbor.distance>currentNode.distance+currentNode.weighted.get(neighbor))
					
				{
					System.out.println("Negative Cycle found");
					System.out.println("Node :"+currentNode.name);
					System.out.println("Distance :"+currentNode.distance);
					int newDistance=currentNode.distance+currentNode.weighted.get(neighbor);
					System.out.println("New distance"+newDistance);
					return;
				}
			}
		}
		for(WeightedNode node:nodeList)
		{
		 System.out.println("Node :"+node+"Distance :"+node.distance+" Path:");
		 pathPrint(node);
		 System.out.println();
		}
	}

	void floydWarshall() {
		int size=nodeList.size();
		int[][] V=new int[size][size];
		
		for(int i=0;i<size;i++)
		{
			WeightedNode first=nodeList.get(i);
			for(int j=0;j<size;j++)
			{
				WeightedNode second=nodeList.get(j);
				if(i==j)
				{
					V[i][j]=0;
				}
				else if(first.weighted.containsKey(second))
				{
					V[i][j]=first.weighted.get(second);
				}
				else {
					V[i][j]=Integer.MAX_VALUE/10;
				}
			}
		}
		for(int k=0;k<size;k++)
		{
			for(int i=0;i<size;i++)
			{
				for(int j=0;j<size;j++)
				{
					if(V[i][j]>V[i][k]+V[k][j])
					{
						V[i][j]=V[i][k]+V[k][j];
					}
				}
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.print("Printing Distance List for "+nodeList.get(i)+" ");
			for(int j=0;j<size;j++)
			{
				System.out.print(V[i][j]+" ");
			}
			System.out.println();
		}


}
}