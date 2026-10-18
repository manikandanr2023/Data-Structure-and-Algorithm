import java.util.*;
public class test {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
    int input1=sc.nextInt();
    int input2=sc.nextInt();
    int input3=sc.nextInt();
    int input4=sc.nextInt();
    int input5=sc.nextInt();
    count(input1,input2,input3,input4,input5);
   
}
public static void count(int input1,int input2,int input3,int input4,int input5)
{
	Map<Integer,Integer> map=new HashMap<>();
	List<Integer> li1=new ArrayList<>();
	List<Integer> arli=new ArrayList<>();
	li1.add(input1);
	li1.add(input2);
	li1.add(input3);
	li1.add(input4);
	li1.add(input5);
	for(int li2:li1)
	{int value = 0;
		String li3=Integer.toString(li2);
		for(char li4:li3.toCharArray())
		{
			System.out.println(li4);
			int z=li4-'0';
			System.out.println(z);
			map.put(z,map.getOrDefault(z, 0)+1);
			System.out.println(map);
			value=map.get(z);
			
		}
		for(Map.Entry<Integer, Integer> hm:map.entrySet())
		{
			if(value==hm.getValue())
			{
				continue;
			}
			else {
				
				arli.add(li2);
			}
		}
	
		map.clear();
	}
	Collections.sort(arli);
	
	System.out.println(arli.get(0)+arli.get(arli.size()-1));
}
}
