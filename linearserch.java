public class linearserch {
    public static int linearsearch(int number[],int key)
    {
        for (int i=0; i<number.length; i++)
        {
            if(number[i]==key)
            {
                return i;
            }

        }
        return -1;
    }
public static void main(String args[])
{
    int number[]={2,6,8,9,10,14};
   // String menu[]={"dosa","chole bhature","samosa"};
    int key=10;
    int index=linearsearch(number,key);
    if(index==-1)
    {
        System.out.println("not found");
    }
    else{
        System.out.println("key is find at index " +index);
    }
}
}
