import java.util.Scanner;
import java.io.*;
public class FibonacciSeries {
    public static int fibonacciFinding(int n){
        int result=0;
        // 1. BASE CASE CONDITION 
        if(n<=1){
            return n;
        }
        else{
            result=fibonacciFinding(n-1)+ fibonacciFinding(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number in fibonacci series :");
        int n=Sc.nextInt();
        // function calling
        int result=fibonacciFinding(n);
        System.out.println("the final output is :"+ result);
    }
}
