package mani;
class Multi extends Thread{
	public void run() {
		System.out.println("running.....");
	}
	public static void main(String args[])
	{
		Multi m1=new Multi();
		m1.run();
	}
}