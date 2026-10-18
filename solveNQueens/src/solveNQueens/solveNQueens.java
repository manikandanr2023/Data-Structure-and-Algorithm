package solveNQueens;
import java.util.*;
public class solveNQueens {
	public static void main(String[] args)
	{
		int[] nums= {1,2,3,4,5,6,7};
		for(int i=0;i<nums.length;i++)
		{
			int u=(i>>1)+(i&1);
			System.out.println(u);
		}
	}
	

	
	
}

