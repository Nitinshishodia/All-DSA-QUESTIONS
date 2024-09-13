import java.util.Scanner;
import java .io.*;
 class SquareRoot {
    public static int FindSquareRoot(int num){
        int low=0, high=num, result=-1;
        // modified abinary search 
        while(low<=high){
            int mid=low+(high-low)/2;
            long val=mid*mid;

            if(val==num){
                // perfect square root 
                result= mid;
            }
            else if(val<num){
                // store the floor valur , incase the number is not  perfect square root we can  print the floor value.
                result=mid;
                low =mid+1;
            }
            else{
            high=mid-1;
            }
        }
         return result;
    }
    public static void main(String args[])
    {
     Scanner Sc=new Scanner(System.in);
     System.out.println("Enter the number of which you want the square root :");
     int num=Sc.nextInt();
   
    // FUNCTION CALLING 
    int result=FindSquareRoot(num);
    System.out.println("Square root of given number is :" + result); 


    }
}
