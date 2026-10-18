package mani;
import java.util.*;
class ThreadJoinExample extends Thread{
	public void run() {
	for(int i=1;i<=5;i++)
	{
		try {
		Thread.sleep(1000);
		System.out.println(i);
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

	public static void main(String args[])
	{
		ThreadJoinExample t1=new ThreadJoinExample();
		ThreadJoinExample t2=new ThreadJoinExample();
		ThreadJoinExample t3=new ThreadJoinExample();
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
		try
		{
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t3.start();
	}
}