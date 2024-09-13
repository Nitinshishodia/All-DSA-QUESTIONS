import java.util.Scanner;
import java.io.*;

public class powerOf {
    public static int powerFind(int a , int b){
        int mid =0, result = 0, finalResult =0;
        // base casse condition 

        if(b == 1){
            return a;
        }
        // recursive function calls 
        else{
            mid = b/2;
            result = powerFind(a, b);
            finalResult = result* result;
            if(b % 2 == 0){
                return finalResult;
            }
            else{
                return a* finalResult;
            }
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the value  of a ");
        System.out.println(" Enter the value of b ");

        int  a= Sc.nextInt();
        int  b= Sc.nextInt();

        // function calling
        int  result =  powerFind(a , b);
        System.out.println(" power of a a^b is " + result);
    }
}
