package inter;

import java.util.*;
public class interview {
public static void main(String[] args)
{
	int[] nums= {0,1,0,3,12,-9};
	int value=0;
	for(int i=0;i<nums.length;i++)
	{
		int j=0;
		if(nums[i]==0)
		{
			value=i;
		
		for(int k=i;k<nums.length;k++)
			{
			if(nums[k]!=0)
			{
				nums[value]=nums[k];
				nums[k]=0;
				break;
			}
			
			}
			}
		
	}
	System.out.print(Arrays.toString(nums));
}
}
