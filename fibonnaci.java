import java.util.Scanner;
import java.io.*;

public class fibonnaci {
public static int fibonnaciFinding(int n){
    int result=0;
    if(n<=1){
        return n;
    }
    else{
     result=fibonnaciFinding(n-1)+fibonnaciFinding(n-2);
    }
   return result;
}
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=Sc.nextInt();

        // function calling
        int result=fibonnaciFinding(n);
        System.out.println("the fibonnaci of given number is : "+ result);
    }
}
