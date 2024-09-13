import java.util.Scanner;
import java.io.*;

public class search2DMatric {
    public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    int arr[]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    System.out.println("Enter the number of rows :");
    int m=arr.length;    
    int n=arr[0].length;
    if(m==0){
        return false;
    }
    // Binay search implementation
    int low=0, high=m*n-1;
    int mid_idx, mid_element, row_idx, column_idx;
    while(low<=high){
        mid_idx=low+(high-low)/2;
        row_idx=mid_idx/n;
        column_idx=mid_idx%n;
        mid_element=arr[row_idx][column_idx];
    }
    }
}
