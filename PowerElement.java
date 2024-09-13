import java.util.Scanner;
import java.io.*;
public class PowerElement {
    public static int powerFind(int a, int b){
    int mid=0, result=0, finalResult=0;
      // base case condition
      if(b==1){
      return a;
      }
      // recursive functions calls 
      else{
        mid=b/2;
        result=powerFind(a, mid);
        finalResult=result*result;
        if(b%2==0){
            return finalResult;
        }
        else{
            return a*finalResult;
        }
      }

    }
    
public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the value of a and b :");
    int a=Sc.nextInt();
    int b=Sc.nextInt();
    
    // function calling
    int result=powerFind(a, b);
    System.out.println("Power of a^b is :"+ result);
    }
}
