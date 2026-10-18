package BinaryHeap;

public class BinaryHeap {
	int[] arr;
	int sizeOfTree;
	public BinaryHeap(int size)
	{
		arr=new int[size+1];
		sizeOfTree=0;
		
		
		
		
	}
	public boolean isEmpty()
	{
		if(sizeOfTree==0)
		{
			return true;
		}
		return false;
	}
	
	public void insert(int value,String HeapType)
	{
		arr[sizeOfTree+1]=value;
		sizeOfTree++;
		heapifyBottomToTop(sizeOfTree,HeapType);
		System.out.println(value+"Value inserted Successfully");
	}
	public void heapifyBottomToTop(int SizeOfTree,String HeapType)
	{	
		int parent=SizeOfTree/2;
		if(SizeOfTree<=1)
		{
			return;
		}
		if(HeapType=="Min")
		{
			if(arr[SizeOfTree]<arr[parent])
			{
				int temp=arr[parent];
				arr[parent]=arr[SizeOfTree];
				arr[SizeOfTree]=temp;
			}
		}
		else if(HeapType=="Max")
		{
			if(arr[SizeOfTree]>arr[parent])
			{
				int temp=arr[parent];
				arr[parent]=arr[SizeOfTree];
				arr[SizeOfTree]=temp;
			}
		}
		heapifyBottomToTop(parent,HeapType);
		
	}
	public void levelOrder()
	{
		for(int i=1;i<sizeOfTree;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
	public int extractHead(String HeapType)
	{
		if(isEmpty())
		{
			return -1;
		}
		else {
			int exValue=arr[1];
			
			arr[1]=arr[sizeOfTree];
			sizeOfTree--;
			heapifyTopToBottom(1,HeapType);
			return exValue;
		}
		
	}
	
	 public void heapifyTopToBottom(int index, String heapType) {
	int left=index*2;
	int right=index*2+1;
	int swapIndex=0;
	if(sizeOfTree<left)
	{
		return;
	}
	if(heapType=="Min")
	{
		if(left==sizeOfTree)
		{
			if(arr[index]>arr[left])
			{
				int temp=arr[left];
				arr[left]=arr[index];
				arr[index]=temp;
			}
			return;
		}
		else if(arr[right]>arr[left]) {
			swapIndex=left;
		}
		else {
			swapIndex=right;
		}
		if(arr[swapIndex]<arr[index])
		{
			int temp=arr[swapIndex];
			arr[swapIndex]=arr[index];
			arr[index]=temp;
			
		}	
	}
	else if(heapType=="Max")
	{
		if(left==sizeOfTree)
		{
			if(arr[index]>arr[left])
			{
				int temp=arr[left];
				arr[left]=arr[index];
				arr[index]=temp;
			}
			return;
		}
		else if(arr[right]<arr[left]) {
			swapIndex=left;
		}
		else {
			swapIndex=right;
		}
		if(arr[swapIndex]>arr[index])
		{
			int temp=arr[swapIndex];
			arr[swapIndex]=arr[index];
			arr[index]=temp;
			
		}	
	}
	heapifyTopToBottom(swapIndex,heapType);
		  }
	}
