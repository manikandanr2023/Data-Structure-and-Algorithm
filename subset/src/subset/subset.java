package subset;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class subset {
public static void main(String args[])
{
	int[] arr= {1,2,3};
	Solution s=new Solution();
	s.subset(arr);
}

}
class Solution{
	public void subset(int[] arr)
	{
		List<List<Integer>> list=new ArrayList<>();
		helper(list,new ArrayList<>(),arr,0);
		System.out.println(list.toString());	
		
		
	}
	public void helper(List<List<Integer>> list,List<Integer> temp,int[] arr,int index)
	{
		if(index>=arr.length)
		{
			return;
		}
		else {
			for(int i=index;i<arr.length;i++)
			{
				temp.add(arr[i]);
				list.add(new ArrayList<>(temp));
				helper(list,temp,arr,i+1);
				temp.remove(temp.size()-1);
			}
			
		}
	}
}
