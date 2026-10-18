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
		System.out.println(s.recurse1(arr));
		
	}

}
class Solution{
	public List<List<Integer>> recurse1(int[] arr)
	{
		
		List<List<Integer>> li2=new ArrayList<>();
		recurse2(arr,new ArrayList<>(),0,li2);
		return li2;
	}
	private void recurse2(int[] arr,List<Integer> li1,int index,List<List<Integer>> li2)
	{
		if(index==arr.length)
		{
			li2.add(new ArrayList<>(li1));
			return;
		}
		for(int i=index;i<arr.length;i++)
		{
		    
			li1.add(arr[i]);
			recurse2(arr,li1,index+2,li2);
			li1.remove(li1.size()-1);
			
		}
		
	}
}
