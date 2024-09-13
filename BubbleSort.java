import java.util.Arrays;
import java .util.Scanner;
import java.io.*;
public class BubbleSort {
public static void bubbleSort(int arr[]){
for(int i=0; i<arr.length;i++){
boolean swapped=false;
// for every iteration we get biggest element in an array in the end 
for(int j=0;j<arr.length-i-1;j++){
if(arr[j]>arr[j+1]){
// swap between arr[j] and arr[j+1]
int temp= arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
swapped =true;
} 
}
if(!swapped){
break;
}
}
}
    
public static void main(String[] args) { 
// Array Defination 
int arr[]={20, 50,10,12,45,67,90};
        
// Function calling
bubbleSort(arr);
System.out.println("Sorted array is :");
System.out.println(Arrays.toString(arr));
}
}