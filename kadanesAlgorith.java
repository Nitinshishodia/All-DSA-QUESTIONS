import java.util.Scanner;
import java.io.*;

public class kadanesAlgorith {
    public static void kadanes(int number[]){
        int max = Integer.MIN_VALUE;
        int Sum = 0;
        for(int i = 0; i< number.length; i++){
         Sum += number[i];
        
        if(Sum < 0){
            Sum =0;
        }
    }
        max =Math.max(max , Sum);
        System.out.println("maximum sum is  = " + max);
    }
    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        kadanes(number);
    }
}
