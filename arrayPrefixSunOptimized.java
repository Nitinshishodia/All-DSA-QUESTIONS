import java.util.Scanner;
import java.io.*;
public class arrayPrefixSunOptimized {
    public static void prefixSumMatrix(int matrix[][]){
        int m = matrix.length;
        int n = matrix[0].length;
        // traverse in matrix to row wise prefix sum
        for(int i = 0; i<m; i++){
            for(int j = 1; j<n; j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }

        // traverse the array column wise to calculate the column prefix sum
        for(int j = 0; j<n; j++){
            for(int i =1; i<m; i++){
                matrix[i][j]+=matrix[i-1][j];
            }
        }
    }
        public static int prefixSum(int matrix[][], int r1 , int r2, int c1 , int c2){
            int sum = 0 , up = 0, repeated_region = 0, left = 0, result = 0;
            sum = matrix[r2][c2];
            up = matrix[r1-1][c2];
            left = matrix[r2][c1-1];
            repeated_region = matrix[r1-1][c1-1];
            result = sum - up -left + repeated_region;
            return result;

        }
    
    
       
    

    // public static int findSumPrefix(int matrix[][], int r1, int c1 , int r2, int c2){
    //     int sum = 0;
    //     for(int i = r1; i <=r2; i++){
    //       for(int j =c1; j<=c2; j++){
    //           sum+=matrix[i][j];
    //       }
    //     }
    //     return sum;
    //       }
    public static void main(String[] args) {
        Scanner Sc =  new Scanner(System.in);
        int matrix[][]={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
       // function call to calculate prefix sum of row and column matrix
        prefixSumMatrix(matrix);

        // function call to calculate the result
       int r1 = 0 , c1 = 0 , r2 = 1 , c2 = 3;
        int result =prefixSum(matrix,r1,c1,r2,c2);

        System.out.println( " sum of element of given rectange is  " + result);
    }
    }

