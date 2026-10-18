package bubbleSort;

public class Main {
public static void main(String args[])
{
	int[] arr= {5,9,3,1,2,8,4,7,6};
	bubbleSort bs=new bubbleSort();
	bs.bubbleSort(arr);
	bs.print(arr);
}
}
