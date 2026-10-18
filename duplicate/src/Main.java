import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,9,4,5,6,7,8,9};
		int sum=0;
		for(int i=0;i<10;i++)
		{
			sum+=arr[i];
			
		}
	  int s=(9*(9+1))/2;
	  System.out.println(sum-s);
	}
}
