import java.util.*;
public class test {
public static void main(String args[])
{
	int[] nums= {3,6,1,2,5};
	int k=2;
	Solution s=new Solution();
	System.out.println(Solution.recurse(nums,k));
}
}
class Solution
{
	public static int recurse(int[] nums,int k)
	{
		if(nums.length<=1)
			return nums.length;
		int ans=1;
		Arrays.sort(nums);
		int min=nums[0];
		for(int i=1;i<nums.length;i++)
		{
			if((nums[i]-min)>k)
			{
				min=nums[i];
				ans++;
			}
		}
		
		return ans;
	}
}
