package combination;
import java.util.*;

public class combination {
public static void main(String args[])
{
	int[] candidate= {2,3,6,7};
	int target=7;
	Solution s=new Solution();
	s.comsum(candidate, target);
}

}
class Solution{
	public void comsum(int[] candidate,int target)
	{
	List<List<Integer>> list=new ArrayList<>();
	Arrays.sort(candidate);
	backtracking(list,new ArrayList<>(),candidate,target,0);
	
		
	}
	public void backtracking(List<List<Integer>> total,List<Integer> temp,int[] candidate,int target, int index)
	{
		if(target<0)
		{
			return;
		}
		else if(target==0)
		{
			total.add(new ArrayList<>(temp));
		}
		else {
		for(int i=index;i<candidate.length;i++)	
		{
			temp.add(candidate[i]);
			backtracking(total,temp,candidate,target-candidate[i],i);
			temp.remove(temp.size()-1);
		}
		}
		
	}
}
