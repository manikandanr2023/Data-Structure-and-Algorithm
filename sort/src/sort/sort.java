package sort;

public class sort {
	//bubble Sort
	public void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			}
		}
	}
	//Selection Sort
	public void selectionSort(int[] arr)
	{
		
	for(int i=0;i<arr.length;i++)
	{
		int minimumIndex=i;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[j]>arr[j+1])
			{
				minimumIndex=j+1;
			}
		}
		if(minimumIndex!=i)
		{
			int temp=arr[i];
			arr[i]=arr[minimumIndex];
			arr[minimumIndex]=temp;
		}
	}
	
	}
	//Insertion Sort
	  public void insertionSort(int[] arr) {
		    for(int i=1;i<arr.length;i++)
		    {
		    	int temp=arr[i],j=i;
		    	while(j>0&&arr[j-1]>temp)
		    	{
		    		arr[j]=arr[j-1];
		    		j--;
		    	}
		    	arr[j]=temp;
		    }
		  }

	public void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
