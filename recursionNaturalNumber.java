import java.util.Scanner;
import java.io.*;
public class recursionNaturalNumber {
    public static int firstNaturalNumber(int n ){
        if(n == 1){
            return 1;
        }
        int Snm1 = firstNaturalNumber(n-1);
        int Sn = n + Snm1;
        return Sn;
    }

       
    public static void main(String[] args) {
        int n = 5;
        System.out.println(firstNaturalNumber(n));
    }
}
