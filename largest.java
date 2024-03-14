import java.util.*;
public class largest {
    public static int getlargest(int number[])
    {
       int largest=Integer.MIN_VALUE;//infinity

        for(int i=0; i<number.length; i++)
        {
            if(largest<number[i])
            {
                largest=number[i];
            }
        }
        return largest;
    }
public static void main(String args[])
{
    int number[]={2,8,9,10,21,8};
    System.out.println("the largest number "+getlargest(number));

}
}
