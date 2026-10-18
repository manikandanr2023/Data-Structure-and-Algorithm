package QueueUsingArray;

public class Queue {
public int[] arr;
int topOfQueue;
int BeginningOfQueue;

public Queue(int Size)
{
	arr=new int[Size];
	topOfQueue=-1;
	BeginningOfQueue=-1;
}
public boolean isEmpty()
{
	if(BeginningOfQueue==-1)
	{
		return true;
	}
	return false;
}
public boolean isFull()
{
	if(topOfQueue==arr.length)
	{
		return true;
	}
	return false;
}
public void enqueue(int Value)
{
	if(isEmpty())
	{
		topOfQueue++;
		BeginningOfQueue++;
		arr[topOfQueue]=Value;
		System.out.println("Queue Element index "+topOfQueue+"  "+arr[topOfQueue]);
	}
	else {
		if(isFull())
		{
			System.out.println("Queue is Full");
		}
		else {
			
			
		topOfQueue++;
		arr[topOfQueue]=Value;
		System.out.println("Queue Element index "+topOfQueue+"  "+arr[topOfQueue]);
		}
	}
		
}

public void dequeue()
{
	if(isEmpty())
		
	{
		System.out.println(BeginningOfQueue);
		System.out.println(topOfQueue);
		System.out.println("Queue is Empty");
		
	}
	else {
		System.out.println("Dequeue Element is"+arr[BeginningOfQueue]);
		BeginningOfQueue++;
		
		if(BeginningOfQueue>topOfQueue)
		{
			
			topOfQueue=BeginningOfQueue=-1;
				
		}
	
	}
}
public void peek()
{
	if(isEmpty())
	{
		System.out.println("Queue is Empty");
	}
	else {
		System.out.println("Queue Element"+arr[BeginningOfQueue]);
	}
}
public void deleteAllElement()
{
	arr=null;
	System.out.println("Delete all Elements");
}
	
}
