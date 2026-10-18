package BinaryHeap;

public class Main {
	public static void main(String args[])
	{
		BinaryHeap BH=new BinaryHeap(11);
		BH.insert(70, "Min");
		BH.insert(80, "Min");
		BH.insert(30, "Min");
		BH.insert(20, "Min");
		BH.insert(31, "Min");
		BH.insert(27, "Min");
		BH.insert(40, "Min");
		BH.insert(10, "Min");
		BH.insert(5, "Min");
		BH.insert(3, "Min");
		BH.insert(1, "Min");
		BH.levelOrder();
		
		System.out.println("After");
		BH.extractHead("Min");
		BH.levelOrder();
		
		
	}

}
