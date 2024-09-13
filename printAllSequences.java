import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class printAllSequences {
public static void printAllSequences(int arr[],int index,ArrayList<Integer> tempArr)
{
// Base case 
if(index==arr.length)
{
    // print all subsequences -- but do not print empty entries.
    if(tempArr.size()>0){
        System.out.println(tempArr);
    }
    return;
}        

// recursive call

// include 
printAllSequences(arr, index+1, tempArr);
// Add the value in tempArr
tempArr.add(arr[index]);

//  do not include 
printAllSequences(arr, index+1, tempArr);
tempArr.remove(tempArr.size()-1);
    }
    public static void main(String[] args) {
        int arr1[]={1,2};
        System.out.println("For the array - "+Arrays.toString(arr1));
        printAllSequences(arr1, 0,new ArrayList<>());
        System.out.println();

         int arr2[]={1,2,3};
        System.out.println("For the array - "+Arrays.toString(arr2));
        printAllSequences(arr2, 0,new ArrayList<>());
    }
}
