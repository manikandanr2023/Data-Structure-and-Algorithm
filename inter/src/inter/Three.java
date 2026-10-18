package inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
public class Three {
	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		int n=list.size();
		int k=10;
		
		list.addAll(0,list.subList(n-(k%n),list.size()));
	
		System.out.print(list.subList(0, n));
//		int[] nums= {1,2,3,4,5,6,7 };
//		int k=3;
//		int r=0;
//		while(r<3)
//		{
//			int e=nums[nums.length-1];
//			for(int i=nums.length-1;i>0;i--)
//			{
//				nums[i]=nums[i-1];
//			}
//			nums[0]=e;
//			r++;
//			
//		}
//		System.out.print(Arrays.toString(nums));
	}

}
