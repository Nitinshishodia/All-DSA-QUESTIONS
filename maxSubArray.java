import java.util.Scanner;
import java.io.*;
public class maxSubArray {
    public static void subArray(int number[]){
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<number.length; i++){
            int start = i;
            for(int j = i; j<number.length; j++){
                int end = j;
                currSum =0;
                for(int k = start; k<= end; k++ ){
                    currSum+=number[k];
                }
                System.out.print(currSum);
                if(max  < currSum){
                    max =currSum;
                }
              
            }
           
        }
        System.out.print("max is " + max);
    }
    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        subArray(number);

    }
}
