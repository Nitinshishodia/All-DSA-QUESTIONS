import java.io.*;
import java .util.Scanner;
public class BinarySearch {
    public static int binarySearch(int arr[], int target){
        int low=0; int high=arr.length-1;
        while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
        return mid;
        }
        else if(arr[mid]<target){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }  
        return 0;
}

public static void main(String[] args) {
Scanner Sc=new Scanner(System.in);
// Siz eof the element from the user 
System.out.println("Enter the number of element present in an array ");
int n=Sc.nextInt();
// Enter the array element 
System.out.println("Enter array element :");
int arr[]=new int[n];
for(int i=0; i<n; i++){
    arr[i]=Sc.nextInt();
}

// Enter the target element
System.out.println("Enter the target element :");
int x=Sc.nextInt();


// Function Calling to binary search 
int result=binarySearch(arr, x);
if(result==0){
    System.out.println("Searched element is not present in an array :");
}
else{
    System.out.println("Searched element is found at location :" + result);
}
}
}



