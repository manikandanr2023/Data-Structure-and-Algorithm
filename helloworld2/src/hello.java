import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class hello {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int[] arr=new int[a+1];
	for(int i=0;i<a;i++)
	{
		arr[i]=sc.nextInt();
	}
	Solution s=new Solution();
	System.out.println(s.rec(arr));
	
	
		}

}
class Solution{
public static boolean rec(int[]arr)

{
Stack<Integer> stack=new Stack<>();
int secondele=Integer.MIN_VALUE;
for (int i=arr.length-1;i>=0;i--)
{
	if(arr[i]<secondele)
		return true;
	while(!stack.isEmpty()&&arr[i]>stack.peek())
	{
		
		secondele=Math.max(secondele,stack.peek());
		stack.pop();
	}
	stack.push(arr[i]);

}

	
	return false;
}
}
