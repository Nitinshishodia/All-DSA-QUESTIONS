import java.util.Scanner;
import java.io.*;
class LowerBound {
    public static int FindFirstOccurance(int arr[], int x){
        int low=0; int high=arr.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                result=mid;
                high=mid-1;
            }
            else if(arr[mid]>x){
            high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number of element present in an array :");
        int n=Sc.nextInt();

        int arr[]=new int[n];
         System.out.println("Enter the array element :");
         for(int i=0; i<n; i++){
            arr[i]=Sc.nextInt();
         }
         System.out.println("Enter the target element ");
         int x=Sc.nextInt();

         // FUNCTION CALLING 
         int result=FindFirstOccurance(arr, x);
         if(result==-1){
            System.out.println("Target element is not present in an array :");
         }
         else{
            System.out.println("Target element is presnt in an array : " + result);
         }
    }
}
