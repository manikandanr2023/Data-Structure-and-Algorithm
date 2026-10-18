package inter;

import java.util.*;
public class Five {
	public static void main(String args[])
	{	String[] strs= {"eat","tea","tan","ate","nat","bat"};
	
	Set<String> list=new HashSet<>();
	Map<String,Set<String>> map=new HashMap<>();
	List<Character> l1=new ArrayList<>();
	List<Character> l2=new ArrayList<>();
	String va = "";
	for(String a:strs)
	{va="";
		for(int i=0;i<a.length();i++)
		{
			l1.add(a.charAt(i));
			Collections.sort(l1);
			list.add(a);
		}
		for(int y=0;y<l1.size();y++)
		{
			va+=l1.get(y);
		}
		l1.clear();
		if(map.containsKey(va))
		{
			Set<String> h=map.get(va);
			h.add(a);
			map.put(va, h);
		}
		else {
			
			map.put(va, new HashSet<>());
			if(map.containsKey(va))
			{
				Set<String> h=map.get(va);
				h.add(a);
				map.put(va, h);
			}
			
		}
		
	
	}
	for(Map.Entry<String, Set<String>> hm:map.entrySet())
	{
		System.out.println(hm.getValue());
	}
	
	
	}
	

}
