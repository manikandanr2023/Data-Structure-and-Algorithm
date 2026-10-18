package graphMatrix;

public class graphNode {
String name;
int index;
graphNode parent;
public boolean isVisited=false;
public graphNode(String name,int index)
{
	this.name=name;
	this.index=index;
}
}
