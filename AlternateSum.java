import java.util.Scanner;
import java.io.*;
public class AlternateSum {
    public static int sum(int num){
        
// Base case condition 
        if(num==0){
            return 0;
        }
         
        if(num%2==0){
            return sum(num-1)-num;
        }
        else{
            return sum(num-1)+num;
        }
    }

    public static void main(String[] args) {
        int num=0;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number :");
         num=Sc.nextInt();

    // function calling
    int result=sum(num);
    System.out.println("The sum of alternate series is :"+result);

    }
}
