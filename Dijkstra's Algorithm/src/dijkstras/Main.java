package dijkstras;
import java.util.*;
public class Main {
public static void main(String args[])
{
	ArrayList<WeightedNode>  wnarr=new ArrayList<>();
	wnarr.add(new WeightedNode("A",0));
	wnarr.add(new WeightedNode("B",1));
	wnarr.add(new WeightedNode("C",2));
	wnarr.add(new WeightedNode("D",3));
	WeightedGraph wg=new WeightedGraph(wnarr);
	wg.addWeightedEdge(0, 3, 1);
	wg.addWeightedEdge(0, 1, 8);
	wg.addWeightedEdge(1, 2, 1);
	wg.addWeightedEdge(2, 0, 4);
	wg.addWeightedEdge(3, 1, 2);
	System.out.println("Printing Floyd Warshall algorithm from source : A");
	wg.floydWarshall();
	
	
}

}
