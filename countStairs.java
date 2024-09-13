import java.util.Scanner;
import java.io.*;

public class countStairs {
    // function defination
    public static int countNum(int n){
        int result=0;
        if(n <= 1){
             return n;
        }
        else{
            result= countNum(n-1)+countNum(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
      System.out.println("Enter the numbers of stairs : ");
      int n = Sc.nextInt();

      // function calling
      int result = countNum(n+1);
      System.out.println("Number of ways is : "+ result);
    }
}
