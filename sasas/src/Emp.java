
public class Emp {
	int id;
	String name;
	Address address;
	public Emp(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{System.out.println(id+""+name);
	System.out.println(address.city+""+address.state+""+address.country);
	}
	
	
	
	
	
	
	
	
	
	public static void main(String args[])
	{
		Address a1=new Address("gzb","Up","india");
		Address a2=new Address("gno","up","india");
		Emp e=new Emp(111,"varun",a1);
		Emp e1=new Emp(112,"arun",a2);
		e.display();
		e1.display();
		
		
	}

}
