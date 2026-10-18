import java.util.*;
public class combination1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int target=sc.nextInt();
		int[] arr=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		you s=new you();

	System.out.println(s.recurse(arr,target));
	}
	
}
class you{
	List<List<Integer>> res=new ArrayList<>();
	public  List<List<Integer>> recurse(int[] arr,int target)
	{
		if(arr.length==0)
		{
			return res;
		}
		recurse1(arr,target,0,0,new ArrayList<>());
		return res;
	}
	private  void recurse1(int[] arr,int target,int index,int sum,List<Integer> sublist)
	{
		if(index>=arr.length||sum>target)
		{
			return;
		}
		if(sum==target)
		{
			res.add(new ArrayList<>(sublist));
			return;
		}
		for(int i=index;i<arr.length;i++)
		{
			sublist.add(arr[i]);
			recurse1(arr,target,i,sum+arr[i],sublist);
			sublist.remove(sublist.size()-1);
		}
	}
}