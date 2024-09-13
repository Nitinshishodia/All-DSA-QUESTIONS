import java.util.Scanner;
import java.io.*;
public class sumDigit {
    static int func(int n){
        if(n == 0)
        return 0;
        return(n%10 + func(n/10));
    }
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = Sc.nextInt();
        int ans = func(n);
        System.out.println("The sum of digit is :" + n + " is " + ans);
    }
}
