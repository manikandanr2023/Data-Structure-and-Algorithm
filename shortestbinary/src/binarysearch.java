import java.util.*;
public class binarysearch {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int[][] arr= {{0,1,0},{0,0,0},{1,1,0}};
	Solution s=new Solution();
	s.recurse1(arr);
	
}
}
class Solution{
	private class Point{
		private int x;
		private int y;
		private Point(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
		
	}
	public void recurse1(int[][] arr)
	{
		int len=arr.length-1;
		int count=0;
//		if(arr[0][0]==1||arr[len][len]==1)
//		{
//			return -1;
//		}
		Queue<Point> qu=new LinkedList<>();
		qu.add(new Point (0,0));
		while(!qu.isEmpty())
		{
			int size=qu.size();
			while(size-->0)
			{
			 Point head=qu.poll();
			 int x=head.x;
			 int y=head.y;
//			 if(x==len&&y==len)
//			 {
//				 return count+1;
//			 }
			 if(x<0||y<0||x>len||y>len||arr[x][y]>=1)
			 {
				 continue;
			 }
			 arr[x][y]=2;
			 qu.offer(new Point(x-1,y));
			 qu.offer(new Point(x+1,y));
			 qu.offer(new Point(x,y-1));
			 qu.offer(new Point(x,y+1));
			 qu.offer(new Point(x-1,y-1));
			 qu.offer(new Point(x-1,y+1));
			 qu.offer(new Point(x+1,y-1));
			 qu.offer(new Point(x+1,y+1));
			 
			}
			count++;
		}
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
			System.out.println(i+" "+j+" "+arr[i][j]);
			}
		}
		System.out.println(count);
	
		
	}
}