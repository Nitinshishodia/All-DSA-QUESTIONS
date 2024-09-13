import java.util.Scanner;
import java.io.*;
public class recursionFibonacciNumber {
    public static int calculateFibonnacci(int n){
        int result = 0;
        if ( n == 0 || n == 1){
            return n;
        }
        else{
    int fib1 = calculateFibonnacci(n-1);
    int fib2 = calculateFibonnacci(n-2);
    result  = fib1 + fib2;
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 6;
       int result = calculateFibonnacci(n);
       System.out.println(result);
    }
}
