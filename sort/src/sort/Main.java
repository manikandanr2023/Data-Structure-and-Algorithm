package sort;


public class Main{
	
public static void main(String args[])
{
	
	int[] arr= {5,9,3,1,2,8,4,7,6};
	sort s=new sort();
//	s.bubbleSort(arr);
//	s.selectionSort(arr);
	s.insertionSort(arr);
	s.print(arr);
}
}