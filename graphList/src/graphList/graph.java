package graphList;
import java.util.*;


public class graph {
ArrayList<graphNode> node=new ArrayList<>();
public graph(ArrayList<graphNode> node)
{
	for(graphNode gn:node)
	{
		this.node.add(gn);
	}
}
public void addUnDirection(int i,int j)
{
	graphNode first=node.get(i);
	graphNode second=node.get(j);
	first.neighour.add(second);
	second.neighour.add(first);
}
public void addDirection(int i,int j)
{
	graphNode first=node.get(i);
	graphNode second=node.get(j);
	first.neighour.add(second);
}
public void print()
{
	StringBuilder s=new StringBuilder();
	for(int i=0;i<node.size();i++)
	{
		s.append(node.get(i).name+":");
		for(int j=0;j<node.get(i).neighour.size();j++)
		{
			if(j==node.get(i).neighour.size()-1)
			{
				s.append(node.get(i).neighour.get(j).name);
				
			}
			else {
				s.append(node.get(i).neighour.get(j).name+"->");
			}
		}
		s.append("\n");
	}
	System.out.println(s.toString());
}
public void bfs()
{
	for(graphNode g:node)
	{
		if(!g.isVisited)
		{
			bfsvisit(g);
		}
	}
}
public void bfsvisit(graphNode g)
{
	Queue<graphNode> queue=new LinkedList<>();
	queue.add(g);

	while(!queue.isEmpty())
	{
		graphNode temp=queue.remove();
		temp.isVisited=true;
		System.out.print(temp.name+" ");
		ArrayList<graphNode> neighbor=node.get(temp.index).neighour;
		for(graphNode u:neighbor)
		{
			if(!u.isVisited)
			{
				
			queue.add(u);
			u.isVisited=true;
			}
		}
	}
}

//bfs ssspp
public void printpath(graphNode node)
{
	if(node.parent!=null)
	{
		printpath(node.parent);
	}
	System.out.print(node.name+" ");
}
public void bfsforssspp(graphNode g)
{
	Queue<graphNode> queue=new LinkedList<>();
	queue.add(g);

	while(!queue.isEmpty())
	{
		graphNode temp=queue.remove();
		temp.isVisited=true;
		System.out.print(temp.name+" "+": ");
		printpath(temp);
		System.out.println();
		
		ArrayList<graphNode> neighbor=node.get(temp.index).neighour;
		for(graphNode u:neighbor)
		{
			if(!u.isVisited)
			{
				
			queue.add(u);
			u.parent=temp;
			u.isVisited=true;
			}
		}
	}
}









public void dfs()
{
	for(graphNode g:node)
	{
		if(!g.isVisited)
		{
			dfsvisit(g);
		}
	}
	
}
public void dfsvisit(graphNode g)
{
	Stack<graphNode> stack=new Stack<>();
	stack.push(g);

	while(!stack.isEmpty())
	{
		graphNode temp=stack.pop();
		temp.isVisited=true;
		System.out.print(temp.name+" ");
		ArrayList<graphNode> neighbor=node.get(temp.index).neighour;
		for(graphNode u:neighbor)
		{
			if(!u.isVisited)
			{
				
			stack.push(u);
			u.isVisited=true;
			}
		}
		
	}
}
public void topologicalSort()
{
	Stack<graphNode> stack=new Stack<>();
	for(graphNode gN:node)
	{
		if(!gN.isVisited)
		{
			topologicalVisit(gN,stack);
		}
	}
	while(!stack.isEmpty())
	{
		System.out.print 	(stack.pop().name+" ");
	}
}
public void topologicalVisit(graphNode TVnode,Stack<graphNode> stack)
{
	
	for(graphNode temp:TVnode.neighour)
{
if(!temp.isVisited)
{
topologicalVisit(temp,stack);	
}
}
	
stack.push(TVnode);
TVnode.isVisited=true;
}

}

