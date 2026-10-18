
public class Passenger {
String passengername;
int age;
String Berthpreference;
int id=0;
int number=-1;
String alloted;
public Passenger(String passengername,int age,String Berthpreference)
{
	this.passengername=passengername;
	this.age=age;
	this.Berthpreference=Berthpreference;
	this.id=id++;
	alloted="";
	number=-1;
	
}
}
