import java.util.*;
public class bitmanipulationevenodd {
public static void evenodd(int n)
{
 int bitmask=1;
if((n & bitmask)==0)
{
    System.out.println("even");

}
else
{
    System.out.println("odd");
}
}

public static void main(String args[])
{
    evenodd(3);
    evenodd(14);
    evenodd(11);
}}