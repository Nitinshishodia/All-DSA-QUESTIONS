import java.util.Scanner;
import java.io.*;
public class multipleNum {
    public static void multiply(int n,int k){
        if(k==1){
            System.out.println(n);
            return;
        }
            multiply(n, k-1);
        
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int k=Sc.nextInt();
        multiply(n, k);
       
    }
}
