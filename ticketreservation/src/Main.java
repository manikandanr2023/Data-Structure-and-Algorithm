import java.util.*;
public class Main {
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 boolean loop=true;
	 switch(loop)
	 {
	
		 System.out.println("1.Book Ticket\n 2.Cancel Ticket \n 3.Available Tickets \n 4.Booked Tickets \n 5.Exit");
		 case 1:
			 System.out.println("Enter passenger name,age and berth preference(L,M or U");
			 String name=sc.next();
			 int age=sc.nextInt();
			 String berthpreference=sc.next();
			 Passenger p=new Passenger(name,age,berthpreference);
			 bookTicket(p);
			 break;
			 
		 case 2:
			 System.out.println("Enter Passenger Id to cancel");
			 int id=sc.nextInt();
			 cancelticket(id);
			 break;
		 case 3:
			 ticketbooker t=new ticketbooker();
			 t.availableticket();
			 break;
		 case 4:
			 ticketbooker t=new ticketbooker();
			 t.availablepassenger();
			 break;
		 case 5:
			 loop=false;
			 break;
		default:break;
		
	 }
	}
	public void bookTicket(Passenger p)
	{
		Ticketbooker booker=new Ticketbooker();
		if(Ticketbooker.availablelist==0)
		{
			System.out.println("NO Tickets are available");
			return;
			
		}
		if(p.Berthpreference.equals("L")&&Ticketbooker.availablelb>0||p.Berthpreference.equals("M")&&Ticketbooker.availablemb>0||p.Berthpreference.equals("U")&&Ticketbooker.availableup>0)
		{
			System.out.println("Prefered birth available");
			if(p.Berthpreference.equals("L"))
			{
				System.out.println("Prefered Lower birth is given");
				booker.bookTicket(p,(Ticketbooker.lb.get(0)),"L");
				Ticketbooker.lb.remove(0);
				Ticketbooker.availablelb--;
				
			}
			else if(p.Berthpreference.equals("M"))
			{
				System.out.println("Prefered birth available");
				booker.bookTicket(p,(Ticketbooker.mb.get(0)),"M");
				Ticketbooker.mb.remove(0);
				Ticketbooker.availablemb--;
			}
			else if(p.Berthpreference.equals("U"))
			{
				System.out.println("Prefered birth available");
				booker.bookTicket(p,(Ticketbooker.ub.get(0)),"U");
				Ticketbooker.ub.remove(0);
				Ticketbooker.availableup--;
			}
			else if(Ticketbooker.availablelb>0)
			{
				System.out.println("Lower birth Given");
				booker.bookTicket(p,(Ticketbooker.lb.get(0)),"L");
				Ticketbooker.lb.remove(0);
				Ticketbooker.availablelb--;
				
			}
			else if(Ticketbooker.availablemb>0)
			{
				System.out.println("Middle birth Given");
				booker.bookTicket(p,(Ticketbooker.lb.get(0)),"M");
				Ticketbooker.mb.remove(0);
				Ticketbooker.availablemb--;
				
			}
			else if(Ticketbooker.availableup>0)
			{
				System.out.println("Upper birth is given");
				booker.bookTicket(p,(Ticketbooker.ub.get(0)),"U");
				Ticketbooker.ub.remove(0);
				Ticketbooker.availableup--;
				
			}
			else if(Ticketbooker.availablerac>0)
			{
				System.out.println("Rac ticket available");
				booker.addtorac(p,(Ticketbooker.raclist.get(0)),"RAC");
			}
			else if(Ticketbooker.availablewl>0)
			{
				System.out.println("Waiting list");
				booker.addtowaitinglist(p,(Ticketbooker.waitinglist.get(0)),"WL");
			}
		}
	}

}
