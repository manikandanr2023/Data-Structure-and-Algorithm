import java.util.*;
public class test {
public static void main(String args[])
{
	int[] arr1= {1,2,4,6};
	int[][] arr2= {{1,3},{4,7},{6,1}};
	Solution s=new Solution();
	System.out.println(s.recurse(arr1,arr2));
	
}
}
class Solution{
	public static int[] recurse(int[] arr1,int[][] arr2)
	{
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr1.length;i++)
		{
			map.put(arr1[i],i);
			}
		for(int[] opp:arr2)
		{
			int newvalue=opp[1];
			int oldvalue=opp[0];
		    int index=map.get(opp[0]);
		    arr1[index]=newvalue;
		    map.put(newvalue,index);
		    map.remove(oldvalue);
		    
		  
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		return arr1;
	}
}