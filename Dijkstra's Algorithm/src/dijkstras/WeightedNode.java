package dijkstras;

import java.util.*;
public class WeightedNode implements Comparable<WeightedNode>{

	int index;
	String name;
	int distance;
	WeightedNode parent;
	ArrayList<WeightedNode> neighbour=new ArrayList<>();
	HashMap<WeightedNode,Integer> weighted=new HashMap<>();
	public boolean isVisited=false;
	
	public WeightedNode(String name,int index)
	{
		this.name=name;
		this.distance=Integer.MAX_VALUE;
		this.index=index;
	}
	@Override
	public String toString()
	{
	return name;	
	}
	@Override
	public int compareTo(WeightedNode o)
	{
		return this.distance-o.distance;
	}
}
