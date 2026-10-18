package CircularQueue;

public class Queue {
	int[] arr;
	int topOfQueue;
	int BeginningOfQueue;
	int Size;
	public Queue(int Value)
	{
		this.arr=new int[Value];
		this.Size=0;
		topOfQueue=-1;
		BeginningOfQueue=-1;
	}
	public boolean isEmpty()
	{
		if(Size==0)
		{
			return true;
		}
		return false;
	}
	public boolean isFull()
	{
		if(Size==arr.length)
		{
			topOfQueue=-1;
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
		System.out.println("Enqueue Element   "+arr[topOfQueue]);
		Size++;
	}
		else {
			if(isFull())
			{
				System.out.println("Queue is Full");
			}
			else {
			Size++;	
			topOfQueue++;
			arr[topOfQueue]=Value;
			System.out.println("Enqueue Element   "+arr[topOfQueue]);
						}
			
		}
	}
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		else {
			System.out.println("Dequeue Element"+arr[BeginningOfQueue]);
			BeginningOfQueue++;
			if(BeginningOfQueue>arr.length-1)
			{
				BeginningOfQueue=0;
			}
			if(Size==arr.length)
			{
				topOfQueue=-1;
			}
			Size--;
		}
	}
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		else {
			System.out.println("Queue Peek Element"+arr[BeginningOfQueue]);
		}
	}

}
