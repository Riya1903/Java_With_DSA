public class updateithbit{
    public static int clearithbits(int n,int i)
        {
            int bitMask=~(1<<i);
            return n&bitMask;
        }
        public static int setithbit(int n,int i)
        {
        int bitMask=1<<i;
        return n|bitMask;
        }
        public static int updateithbit(int n,int i,int newBit){

              /*   if(newBit==0)
                {
                    return clearithbit(n,i);
                }
                else{
                    return setithbit(n,i);
                }*/
                n=clearithbits(n,i);
                int BitMask=newBit<<i;
                return n|BitMask;
        }
        public static void main(String[] args) {
            System.out.println(updateithbit(10,2,1));
        }
        }
        

