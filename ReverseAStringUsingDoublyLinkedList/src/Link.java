import java.util.*;
public class Link{
	public static void main(String[] args)
	{
		int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		Solution s=new Solution();
		System.out.println(s.spiralOrder(matrix));
		
	}
}
class Solution {
    private int i;

	public List<Integer> spiralOrder(int[][] a) {
    	List<Integer> list=new ArrayList<>();
    	 int rowStart = 0, rowEnd = a.length;
         int colStart = 0, colEnd = a[0].length;
         
         while(rowStart < rowEnd && colStart < colEnd)
         {
           //print top row (left to right)
           for(int i= colStart;i<colEnd;i++)
             System.out.print(a[rowStart][i]+ " ");
             list.add(a[rowStart][i]);
            rowStart+=1;
             
           //print right column (top to bottom)
           for(int i=rowStart;i<rowEnd;i++)
             System.out.print(a[i][colEnd - 1] + " ");
            list.add(a[i][colEnd-1]);
            colEnd-=1;
            
           // print bottom row (right to left)
           for(int i = colEnd - 1;i >= colStart;i--)
             System.out.print(a[rowEnd - 1][i] + " ");
             list.add(a[rowEnd-1][i]);
            rowEnd-=1;
             
            // print left column (bottom to top)
            for(int i = rowEnd - 1;i >= rowStart;i--)
             System.out.print(a[i][colStart]+ " ");
             list.add(a[i][colStart]);
            colStart+=1;
            
         }
         return list;
    }
}