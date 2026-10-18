import java.util.*;

public class Testsuper1{
	public static void main(String args[])
	{
	List<Integer> a1=new ArrayList<>(Arrays.asList(1,2,3,5,6));
    List<List<Integer>> a2=new ArrayList<>();
    List<List<List<Integer>>> a3=new ArrayList<>();
    List<List<List<List<Integer>>>> a4=new ArrayList<>();
    a2.add(new ArrayList<>(a1));
    a3.add(new ArrayList<>(new ArrayList<>(a2)));
    a4.add(new ArrayList<>(new ArrayList<>((new ArrayList<>(a3)))));
 System.out.println(a4);
	}
}