import java.util.*;
public class back {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		Solution s=new Solution();
		System.out.print(s.recurse1(str1));
		
	}

}
class Solution{
	public List<List<String>> recurse1(String str1)
	{
		List<List<String>> li1=new ArrayList<>();
	    if(str1==null||str1.length()==0)
	    {
	    	return li1 ;
	    }
	    recurse2(li1,str1,new ArrayList<>());
	    	
		return li1;
	}
	private void recurse2(List<List<String>> li1,String str1,List<String> sublist)
	{
		if(str1.length()==0)
		{
			li1.add(new ArrayList<>(sublist));
		}
		for(int i=0;i<str1.length();i++)
		{
			String first=str1.substring(0,i+1);
			if(ispalindrome(first))
			{sublist.add(first);
			String second=str1.substring(i+1,str1.length());
			recurse2(li1,second,sublist);
			sublist.remove(sublist.size()-1);
				
			}
		}
	}
	public boolean ispalindrome(String first)
	{
		String str1=new StringBuilder(first).reverse().toString();
		return first.equals(str1);
	}
}
