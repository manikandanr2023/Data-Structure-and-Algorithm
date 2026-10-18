package inter;

public class Six {
	public static void main(String[] args)
	{
		int[] nums= {3,1,3,4,2};
		int total=0;
		int n=nums.length;
		for(int i=0;i<nums.length;i++)
		{
			total+=nums[i];
			
			
		}
		System.out.println(((n*(n+1))/2)-total);
	}

}
