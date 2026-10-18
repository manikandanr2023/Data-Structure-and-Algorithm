import java.util.*;
public class student1 {
	private class student2{
		

		private String name;
		private int rollno;
		private String department;
		student2(String name,int rollno,String department)
		{
			this.name=name;
			this.rollno=rollno;
			this.department=department;
		}
	}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String name=sc.nextLine();
int rollno=sc.nextInt();
String department=sc.nextLine();
student2 s=new student2();
student2 s1=(s).new student2(name,rollno,department);
System.out.println(s1);


}

}
