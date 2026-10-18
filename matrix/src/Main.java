import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		int[][] matrix= {{6,7,8}};
		Solution s=new Solution();
		System.out.print(s.spiralOrder(matrix));
	}
}












class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        System.out.println(n+" "+m);
        int count=0;
      
        int rowt=0,rowb=n,coll=0,colr=m;
        System.out.println(n*m);
        while(count!=n*m)
        {  if(rowt==rowb||coll==colr)
        {
        	list.remove(list.size()-1);
        	break;
        }
            for(int j=rowt;j<m-rowt;j++)
            {
            list.add(matrix[rowt][j]);
            
                count++;
                
            }
            if(colr-1>=0)
            {
            for(int i=1+rowt;i<n-rowt;i++)
            {
            list.add(matrix[i][colr-1]);
                count++;
            }}
            if(rowb-1>=0)
            {
            for(int j=m-2-rowt;j>=0+rowt;j--)
            {
                list.add(matrix[rowb-1][j]);
                count++;
            }}
            
            
            for(int i=n-2-rowt;i>0+rowt;i--)
            {  
                list.add(matrix[i][coll]);
                count++;
            }
            
            rowt++;
            rowb--;
            coll++;
            colr--;
            
            System.out.println(rowt+" "+rowb+" "+colr+" "+coll);
        
        
        
        
        
        }
        
        return list;
    }
}