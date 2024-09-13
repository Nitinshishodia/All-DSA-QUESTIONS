import java.util.Scanner;
import java.io.*;
public class oddOrEven {
    public static void oddOrEven(int n ){
        int bitMask = 1;
        if((n & bitMask) == 1){
            // even number
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number ");
        }
    }
   public static void main(String[] args) {
    oddOrEven(13);
    oddOrEven(12);
    oddOrEven(5);
   } 
}
