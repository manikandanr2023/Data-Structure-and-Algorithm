import java.util.*;
public class back {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] arr=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		Solution s=new Solution();
		
		System.out.println(s.recurse(arr));
	}

}
class Solution{
	List<List<Integer>> li1=new ArrayList<>();
	public List<List<Integer>> recurse(int[] arr)
	{
		
		List<Integer> li2=new ArrayList<>();
	
		recurse1(li2,0,arr);
		return li1;
	}
	public void recurse1(List<Integer> li2,int index,int[] arr)
	{
		if(index==arr.length)
		{
			li1.add(li2);
			return;
		}
		for(int  i=index;i<arr.length;i++)
		{
			if(i<(arr.length-2))
			{int sum=0;
			for(int j=i;j<i+3;j++)
			{
				sum+=arr[i];
		
			li2.add(sum);
			}
			recurse1(li2,index+2,arr);
			
		}
		
	}
}
