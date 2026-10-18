package graphList;
import java.util.*;
public class graphNode {
int index;
String name;
boolean isVisited=false;
graphNode parent;
ArrayList<graphNode> neighour=new ArrayList<>();
public graphNode(String name,int index)
{
	this.index=index;
	this.name=name;
}
}
