import java.util.*;
public class inbuilt_sort {
    public static void printarray(int arr[])
    {
        for(int i=0; i<arr.length-1; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
public  static void main(String args[]){
         int arr[]={1,8,5,4,3,2};
        Arrays.sort(arr);
         printarray(arr);
}
}
