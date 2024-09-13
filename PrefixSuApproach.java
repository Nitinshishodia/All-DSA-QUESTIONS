import java.util.Scanner;;
import java .io.*;
public class PrefixSuApproach {
public static int FindSumMatrix(int arr[][], int r1, int c1, int r2, int c2){
    int sum=0;
    for(int i=r1; i<=r2; i++){
    for(int j=c1; j<=c2; j++){
        sum+=arr[i][j];
    }
    }
    return sum;
}
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("enter the number of rows ");
        int m=Sc.nextInt();
        System.out.println("enter the number of column ");
        int n=Sc.nextInt();
         
        int arr[][]= new int [m][n];

        System.out.println("enter the matrix element :");
        for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            arr[i][j]=Sc.nextInt();
        }
        }
        int r1, c1, r2, c2;
        System.out.println("enter the value of r1 coordinate ");
        r1=Sc.nextInt();

        System.out.println("enter the value of c1 coordinate ");
        c1=Sc.nextInt();

        System.out.println("enter the value of r2 coordinate ");
        r2=Sc.nextInt();

        System.out.println("enter the value of c2 coordinate ");
        c2=Sc.nextInt();

        // FUNCTION CALLING 

        int result=FindSumMatrix(arr, r1,c1,r2,c2);
        System.out.println("sum of element of given rectangle is " + result);

    }
}
