import java.util.*;
public class arrayasfunctionargument {
    public static void update(int marks[]){
    for(int i=0; i<marks.length; i++)
    {
          marks[i]=marks[i]+1;
    }
}
public static void main(String args[])
{
    int marks[]={97,95,99};
    update(marks);
    //print marks
    for(int i=0; i<marks.length; i++){
        System.out.println(marks[i]+" ");
    }

}
}
