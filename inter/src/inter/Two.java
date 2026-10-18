package inter;
import java.util.*;
public class Two {
public static void main(String[] args)
{
	String s="OcCurrence";
	int[] ch=new int[54];
	boolean[] bool=new boolean[54];
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>=97&&s.charAt(i)<=122)
	{ch[s.charAt(i)-'a']++;
	bool[s.charAt(i)-'a']=true;}
		if(s.charAt(i)>=65&&s.charAt(i)<=90)
		{ch[s.charAt(i)-'A'+27]++;
		bool[s.charAt(i)-'A'+27]=true;}
	}
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>=97&&s.charAt(i)<=122)
		{
		if(bool[s.charAt(i)-'a']==true)
		{
		System.out.print(s.charAt(i)+""+ch[s.charAt(i)-'a']);
	bool[s.charAt(i)-'a']=false;
		}}
		if(s.charAt(i)>=65&&s.charAt(i)<=90)
		{
		if(bool[s.charAt(i)-'A'+27]==true)
		{
		System.out.print(s.charAt(i)+""+ch[s.charAt(i)-'A'+27]);
	bool[s.charAt(i)-'A'+27]=false;
		}}
	}
	
	
//	Map<Character,Integer> map=new LinkedHashMap<>();
//	for(int i=0;i<s.length();i++)
//	{
//		map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
//	}
//	
//		for(Map.Entry<Character, Integer> hm:map.entrySet())
//		{
//			System.out.print(hm.getKey()+""+hm.getValue());
//		}
	
}
}
