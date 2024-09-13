import java.util.Scanner;
import java.io.*;
public class SumDigitsRecrsion {
    public static int sumDigit(int num){
    if(num==0){
        return 0;
    }
    else{
        return num%10 +sumDigit(num/10);
    }
}
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=Sc.nextInt();
        //System.out.println("the sum of digit is:"+ SumDigit(n));
        int sum=sumDigit(num);
        System.out.println("Sum of digit is:"+sum);
    }
}

