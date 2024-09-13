import java.util.Scanner;
import java.io.*;
// Time Complexity - o(log n)
public class firstAndlast1 {
    public static int first(int nums[], int target){
       int low = 0; int high = nums.length-1;
       int mid = low + (high - low)/2 ;
       int ans = -1;
       while (low <= high) {
        if(nums[mid] == target){
            ans = mid ;
            high = mid -1;
        }
        else if(target > nums[mid]){
            low = mid +1;
        }
        else if(target < nums[mid]){
            high = mid -1;
        }
        mid = low + (high - low)/2;
       }
        return ans;
    
    }
    public static int last(int nums[], int target){
        int low = 0; int high = nums.length-1;
        int mid = low + (high - low)/2 ;
        int ans = -1;
        while (low <= high) {
         if(nums[mid] == target){
             ans = mid ;
             low = mid + 1;
         }
         else if(target > nums[mid]){
             low = mid +1;
         }
         else if(target < nums[mid]){
             high = mid -1;
         }
         mid = low + (high - low)/2;
        }
         return ans;
     
     }
    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
         int ans = first(nums, target);
         int ans1 = last(nums, target);
         if( ans  == -1){
            System.out.println(" target element is not found in array ");
         }
         else{
            System.out.println("Target element of first occurences is present in an arry " + ans);
         }
         if( ans1  == -1){
            System.out.println(" target element is not found in array ");
         }
         else{
            System.out.println("Target element of first occurences is present in an arry " + ans1);
         }

    }
}
