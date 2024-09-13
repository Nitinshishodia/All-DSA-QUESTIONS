import java.util.Scanner;
import java.io.*;

public class BinarySearchRecur {
    public static int BinarySearch1(int arr[], int low, int high, int target){
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            
//   condition : 1
        if(arr[mid]==target){
            return mid;
        }
//   condition :2
        if(arr[mid]<target){
            return BinarySearch1(arr, mid+1, high, target);
        }
//   condition :3
        if(arr[mid]>target){
            return BinarySearch1(arr, low, mid-1, target);
         }        

        }
        return result;
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number of element present in an array");
        int n=Sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array element:");
        for(int i=0; i<n;i++){
        arr[i]=Sc.nextInt();
        }
        System.out.println("Enter the target element :");
        int target=Sc.nextInt();

        // function calling
        int result=BinarySearch1(arr, 0 , arr.length-1,target);
        if(result==-1){
            System.out.println("no target element is found in an arry:");
        }
        else{
            System.out.println("the target index is :"+ result);
        }
    }
}
