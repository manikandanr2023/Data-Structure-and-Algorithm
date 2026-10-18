package employee;
import java.util.*;
public class Main {
public static void main(String args[])
{
	Employee e=new Employee("Manikandan",3500);
	e.raiseamount(22);
	Manager m=new Manager("Manjula",4500,45);
	
	System.out.println(e.getSalary());
	System.out.println(m.getSalary());
}
}
class Employee{
	String name;
	double salary;
	Employee(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	Employee(){
	}
	void setSalary(double salary) {this.salary=salary;}
	double getSalary() {return salary;}
	void raiseamount(int percent)
	{
	salary+=(salary*percent)/100;
	}
}
class Manager extends Employee{
	double bonus;
	Manager(String n,double s,double b)
	{
		name=n;
		salary=s;
		bonus=b;
	}
	void setBonus(double bonus)
	{
		this.bonus=bonus;
	}

	
	
}