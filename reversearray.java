   public class reversearray {
    public static void reverse(int arr[])
    {
        int first=0;
        int last=arr.length-1;
        while(first<last)
        {
            //swap
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;


        }

    }
    public static void main(String[] args) {
        int arr[]={2,8,5,3,7,8};
        reverse(arr);
        //print array
        for(int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        
    }
}
