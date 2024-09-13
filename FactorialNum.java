import java.util.Scanner;
import java.io.*;
import java.security.DrbgParameters.Reseed;
public class FactorialNum{
    public static long factorialFind(long n){
        long result=0;
        // BASE CASE CONDITION
        if(n==0 || n==1){
            return 1;
        }
        else{
            // RECURSIVE CALLING
             result=n*factorialFind(n-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("ENter the number :");
        long n=Sc.nextInt();

        long result=factorialFind(n);
        System.out.println("the factorial of given number is :"+ result);
        
    }
}

