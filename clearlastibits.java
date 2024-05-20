public class clearlastibits {
    public static int clearlastIbits(int n,int i)
    {
          int bitMask=(~0)<<i;
          return n&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearlastIbits(15,2));
    }
    
}
