    import java.util.*;
    public class smallest {
        public static int getsmallest(int number[])
        {
           int smallest=Integer.MAX_VALUE;//infinity
    
            for(int i=0; i<number.length; i++)
            {
                if(smallest>number[i])
                {
                    smallest=number[i];
                }
            }
            return smallest;
        }
    public static void main(String args[])
    {
        int number[]={2,8,9,10,21,8};
        System.out.println("the smallest number "+getsmallest(number));
    
    }
    }
    

