// TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)
import java .util.Scanner;
import java.io.*;
public class LinearSearch {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the number of element present in an array :");
    int n=Sc.nextInt();
    // Enter the array element 
    System.out.println("Enter the array element :");
    int arr[]=new int[n];
    for(int i=0; i<n; i++){
        arr[i]=Sc.nextInt();
    }

    // Enter the target element
    System.out.println("Enter the target element ");
    int x=Sc.nextInt();

    // Implementation of arrray
    int idx=-1;
     for(int i=0; i<n; i++){
        if(arr[i]==x){
            idx=i;
         break;
        }
     }
     if(idx==-1){
        System.out.println("Searching element is not found in an array :");
     }
     else{
        System.out.println("Searching element is found at the location :" +idx);
     }
    }
    
}
