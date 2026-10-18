
public class Emp {
   int num;
   String name;
   Address address;
	Emp(int num,String name,Address add)
	{
		this.num=num;
		this.name=name;
		this.address=add;
		}
	void display()
	{
		System.out.println(num+" "+name);
		System.out.println(address.name1+" "+address.name2+" "+address.name3);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
public static void main(String args[])
	
	{
		Address a=new Address("Tamil Nadu","Andra Pradesh","Karnataka");
		Address a1=new Address("Tamil Nadu","Andra Pradesh","Karnataka");
		Emp e=new Emp(111,"Varun",a);
		Emp e2=new Emp(112,"arun",a1);
		e.display();
		e2.display();
		
	}
}
