import java.util.Scanner;
import java.io.*;
public class kadanes {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int sum=0; int max;
        int maxi=arr[0];
        for(int i =0 ; i<arr.length; i++){
            sum = sum + maxi;

        // compare  the maximum element and  find between maxi and sum 
        if(sum > maxi){
            maxi =sum ;
        }
        if(sum <0){
            sum =0;
        }
        
        }
    }
}
