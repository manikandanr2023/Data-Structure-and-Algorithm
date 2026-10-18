package KruskalAlogrithm1;
import java.util.*;

import KruskalAlgorithm.WeightedNode;
public class WeightedNode {
public String name;
public ArrayList<WeightedNode> neighbors=new ArrayList<WeightedNode>();
public HashMap<WeightedNode,Integer> weightMap=new HashMap<>();
public boolean isVisisted=false;
public WeightedNode parent;
public int distance;
public int index;
public DisjointSet set;

public WeightedNode(String name,int index)
{
	this.name=name;
	this.index=index;
	distance=Integer.MAX_VALUE;
}
@Override
public String toString() {
	return name;
}

@Override
public int compareTo(WeightedNode o) {
  return this.distance - o.distance;
}


}
}
