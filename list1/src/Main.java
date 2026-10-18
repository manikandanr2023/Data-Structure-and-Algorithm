import java.util.*;
public class Main {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int a=4;
	Solution s=new Solution();
	System.out.println(s.recurse1(a));
}
}
class Solution{
	public String recurse1(int a)
	{String z="1";
	 
		recurse2(a,1,z);
		return z;
	}
	private void  recurse2(int a,int i,String z)
	
	{
		if(i==a)
		{
			 System.out.println(z);
			 return  ;
		}
       Map<Character,Integer> map=new LinkedHashMap<>();
       for(char y:z.toCharArray())
       {
    	   map.put(y,map.getOrDefault(y, 0)+1);
       }
       Set<Character> set=new LinkedHashSet<>();
       for(char y:z.toCharArray())
       {
    	   set.add(y);
    	   z="";
       }
       for(char y:set)
       {
    	   int r=map.get(y);
    	   z+=""+r+y;
       }
       recurse2(a,i+1,z);
       System.out.println(z);
       return;
      
		
	}
}

