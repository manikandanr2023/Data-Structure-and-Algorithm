import java.util.*;
public class Main {
	public static void main(String args[])
	{
	 List<Character> li1=new LinkedList<>(Arrays.asList('R','A','C','E','C','A','R'));
	 List<Character> li2=new LinkedList<>();
	 for(int i=li1.size()-1;i>=0;i--)
	 {
		 li2.add(li1.get(i));
	
		 
	 }
	 if(li1.equals(li2))
	 {
		System.out.println("True");
	 }
		
	 else {
		 System.out.println(li2);
		 System.out.println(li1);
		 
	 }
		
    }
}