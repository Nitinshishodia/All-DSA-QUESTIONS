public class Reversal {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        for(int i=0;i<n/2; i++){
            //swap two array between array[i] and array[n-i-1].
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println("Reversal Array Is : " );
     for (int i=0; i<n; i++){
        System.out.print(arr[i]+ " ");
     }   
     System.out.println();
    }
}
