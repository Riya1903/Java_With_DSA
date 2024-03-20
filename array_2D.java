import java.util.*;
public class array_2D {
    public static void arraycreation(int matrix[][])
    {
        //int n=matrix.length,m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
    }
    public static void print(int matrix[][])
    {
       // int n=matrix.length,m=matrix[0].length;
        
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean search(int matrix[][],int key)
    {
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
               if(matrix[i][j]==key)
               {
                System.out.print("found at cell ("+i+","+j+")");
                return true;
               }
            }
        }System.out.print("key not found");
         return false;
        
        }
    
public static void main(String args[])
{
    int matrix[][]=new int[3][3];
  arraycreation(matrix);
  print(matrix);
  search(matrix,4);
}
}
