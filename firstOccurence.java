import java.util.Scanner;
import java.io.*;
public class firstOccurence {
    public static int recursionFirstOccurence(int arr[] , int key , int i ){
        if( i == arr.length){
            return -1;
        }
         if( arr[i] == key){
            return i;
         }
         return recursionFirstOccurence(arr, key, i+1);
    }
      public static int recursionLastOccurence(int arr[] , int key , int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = recursionLastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
      }
    public static void main(String[] args) {
        int arr[]  ={8 , 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(recursionFirstOccurence(arr, 5, 0));
         System.out.println(recursionLastOccurence(arr , 5 , 0));
    }
}
