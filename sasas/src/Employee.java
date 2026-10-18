class Programmer{  
 float salary=40000;  
}  
class Employee extends Programmer{  
 int bonus=10000;  
public static void main(String args[])
{   Employee p=new Employee();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus); 

}  
}  