import java.util.*;
public class arraycreation {
public static void main(String args[])
{//creation of array
    int marks[]=new int[50];
   // int numbers[]={1,2,3};
   // String fruits[]={"apple","mango","orange"};
   //input,output & update in array
   //array of length
   System.out.println("length of array "+marks.length);
    Scanner sc=new Scanner(System.in);
    marks[0]=sc.nextInt();//phy
    marks[1]=sc.nextInt();//math
    marks[2]=sc.nextInt();//chem
    System.out.println("phy: "+marks[0]);
    System.out.println("chem: "+marks[1]);
    System.out.println("math: "+marks[2]);
    int percentage=(marks[0]+marks[1]+marks[2])/3;
    System.out.println("percentage: "+percentage);
    



}
}
