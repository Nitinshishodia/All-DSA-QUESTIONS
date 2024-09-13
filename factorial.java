import java.util.Scanner;
import java.io.*;
public class factorial {
    public static int factorialFinding(int n){
        if(n==0){
            return 1;
        }
        
             int result= n*factorialFinding(n-1) ;       
           return result;
     
    }
    public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the value of n :");
    int n=Sc.nextInt();
    // function calling
    int result=factorialFinding(n);
    System.out.println("The factorial of a given number is "+ result);
    }
}

