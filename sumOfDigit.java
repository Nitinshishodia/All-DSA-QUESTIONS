import java.util.Scanner;
import java.io.*;
public class sumOfDigit {
    public static int sod(int n){
        // base case
        if(n>=0 && n<=9){
            return n;
        }
        // recursive works -> small ans
        int smallAns=sod(n/10);
        
        // self work
        return smallAns+n%10;
    }
    public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
        System.out.println(sod(1234));
    }
}
