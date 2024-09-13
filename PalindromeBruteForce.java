import java.util.Arrays;

public class PalindromeBruteForce {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1};
        int arr2[]=new int[arr.length];
        int n=arr.length;
        for(int i=arr.length-1; i>=0; i--){
            arr2[n-i-1]=arr[i];
        }
         boolean IsEqual=Arrays.equals(arr, arr2);
         if(IsEqual){
            System.out.println("Palindromic Array");
         }
         else{
            System.out.println("Not Palindromic array ");
         }
    }
}
