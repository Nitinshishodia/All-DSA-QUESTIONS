import java.util.Scanner;
import java.io.*;
import java.math.BigInteger;

public class BigIntegerpower {
    // function defination
    public static  BigInteger powerFind(BigInteger a,int b){
        BigInteger result, finalResult;
        // base case condition
        if(b==1){
          return a;
        }
        else{
        result=powerFind(a, b/2);
        finalResult=result.multiply(result);
        if(b%2==0){
            return finalResult;
        }
        else{
            return a.multiply(finalResult);
        }
        }
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b:");
        BigInteger a=Sc.nextBigInteger();
        int b=Sc.nextInt();
        // function calling
        BigInteger result=powerFind(a,b);
        System.out.println("power of an element is:"+result);
    }
}
