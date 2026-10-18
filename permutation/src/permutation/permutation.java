package permutation;
import java.util.*;
public class permutation {
	public static void main(String args[])
	{
		int[] nums={1,2,3};
		Solution s=new Solution();
		s.sum(nums);
		
	}

}
class Solution{
	public void sum(int[] nums)
	{
		List<List<Integer>> list=new ArrayList<>();
		boolean[] visited=new boolean[nums.length];
		backtracking(list,new ArrayList<>(),nums,0,visited);
		System.out.println(list.toString());
		
		
	}

	public void backtracking(List<List<Integer>> list,List<Integer> temp, int[] nums, int index, boolean[] visited) {
		if(temp.size()==nums.length)
		{
			list.add(new ArrayList<>(temp));
		}
		for(int i=0;i<nums.length;i++)
		{
			if(visited[i]==true) continue;
			visited[i]=true;
			temp.add(nums[i]);
			backtracking(list,temp,nums,i+1,visited);
			temp.remove(temp.size()-1);
			visited[i]=false;
			
		}
		
	}
}
