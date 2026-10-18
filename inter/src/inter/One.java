package inter;

import java.util.Arrays;

public class One {
	public static void main(String[] args)
	{
		int[] nums= {0,1,0,3,12,0,78,0,0,0,0,9,9,8,-1};
		int value=0;
		boolean bool=true;
		for(int i=0;i<nums.length;i++)
		{
		if(nums[i]==0&&bool==true)
			{
				value=i;
				bool=false;
				}
			else if(nums[i]!=0){
				int u=nums[value];
				nums[value]=nums[i];
				bool=true;
				nums[i]=u;
				
				i=value;
				
				
			}
			
		}
		System.out.print(Arrays.toString(nums));
	}
}
