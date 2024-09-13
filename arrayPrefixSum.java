// Time Complexity : o(row*col)
// space complexity : o(1)

import java.util.Scanner;
import java.io.*;
public class arrayPrefixSum {
    public static int findSumPrefix(int matrix[][], int r1, int c1 , int r2, int c2){
  int sum = 0;
  for(int i = r1; i <=r2; i++){
    for(int j =c1; j<=c2; j++){
        sum+=matrix[i][j];
    }
  }
  return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int r1 = 0  ,c1 = 2 ,r2 = 3,c2 = 3;
       System.out.println(findSumPrefix(matrix,r1,c1,r2,c2));
    }
}
