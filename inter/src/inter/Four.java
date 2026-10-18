package inter;

public class Four {
	public static void main(String[] args)
	{
		int n=13;
		int[] nums=new int[n];
		if(n==1)
		{
			System.out.println(1);
		}
		else if(n==0)
		{
		System.out.println(0);
		}
		else {
			nums[0]=1;
			nums[1]=2;
		
		for(int i=2;i<n;i++)
		{
			
			nums[i]=nums[i-2]+nums[i-1];
		}
		System.out.println(nums[n-1]);
		}
	}

}
