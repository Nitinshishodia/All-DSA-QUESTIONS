import java.util.Scanner;
import java.io.*;
public class divideAndConquerSearchRotatedSortedArray {
    public static int Search(int arr[] , int target , int si , int ei ){
        if(si > ei){
            return -1;
        }

        // kaam
        int mid = si + (ei-si)/2;
        // case found
        if(arr[mid] == target){
            return mid;
        }

        // MID ON L1
        if(arr[si] <= arr[mid]){
            // case a : left
            if(arr[si] <= target && target <= arr[mid]){
                return Search(arr, target, si, mid-1);
            }
            else {
                // case b : right 
                return Search(arr, target, mid+1, ei);
            }
        }

        // MID ON L2
        else{
            // case c : right 
            if(arr[mid] <= target && target <= arr[ei]){
                return Search(arr, target, mid+1, ei);
            }
            else{
                // case d : left 
                return Search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
       int arr[] = {4,5,6,7,0,1,2};
       int target = 0;
       int tarIdx = Search(arr , target , 0, arr.length-1);
       System.out.println(tarIdx);
        

    }
}
