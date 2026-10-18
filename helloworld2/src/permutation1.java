import java.util.*;

public class permutation1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] arr=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
	   
		System.out.print(customer.back(arr));		
	}

}
class customer{
	public static List<List<Integer>> back(int[] arr)
	{
			Set<List<Integer>> set=new HashSet<>();
			List<List<Integer>> li1=new ArrayList<>();
			
			
			boolean[] visited=new boolean[arr.length];
			backtrack(arr,set,visited,new ArrayList<>());
			for(List<Integer> el:set)
			{
				li1.add(el);
			}
			return li1;
		}
		private static  void backtrack(int[] arr,Set<List<Integer>> set,boolean[] visited,List<Integer> res)
		{
			if(arr.length==res.size()) {
				set.add(new ArrayList<>(res));
				System.out.println(set);
				
			}
			for(int i=0;i<arr.length;i++)
			{
				if(!visited[i])
				{res.add(arr[i]);
				visited[i]=true;
				backtrack(arr,set,visited,res);
				visited[i]=false;
				res.remove(res.size()-1);
					
					
				}
			}
	}
}

