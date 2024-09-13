import java .util.Scanner;
import java.io.*;

// TIME COMPLEXITY : O(m*n)
// SPACE COMPLEXITY : 0(1)
public class prefixSumBetterApproach {
public static void prefixSumMatrix(int arr[][]){
int m=arr.length;
int n=arr[0].length;  
  // TRAVERSED THE ARRAY ROW WISE TO CALCULATE THE PREFIX SUM
for(int i=0; i<m; i++){
for(int j=1; j<n; j++){
arr[i][j]+=arr[i][j-1];
}
}
  // TRAVERSED THE ARRAY COLUMN WISE TO  CALCULATE THE COLUMN WISE PREFIX SUM
  /// FINAL 2D ARRAY
for(int j=0; j<n; j++){
for(int i=1; i<m; i++){
arr[i][j]+=arr[i-1][j];
}
}
}
public static int SumRegion(int arr[][], int r1, int c1, int r2,int c2){
int sum=0; int up=0; int repeated_region=0; int result=0;int left=0;
sum=arr[r2][c2];
up=arr[r1-1][c2];
left=arr[r2][c1-1];
repeated_region=arr[r1-1][c1-1];

result=sum-up-left+repeated_region;
return result;

}
public static int FindSumMatrix(int arr[][], int r1, int c1, int r2, int c2){
int sum=0;
for(int i=r1; i<=r2; i++){
for(int j=c1; i<=c2; j++){
sum+=arr[i][j];
}
}

return sum;
}
public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter The Number Of rows: ");
        int m=Sc.nextInt();
        System.out.println("enter the numbers of column ");
        int n=Sc.nextInt();

        int arr[][]= new int[m][n];

        System.out.println("enter the matrix element :");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
        arr[i][j]=Sc.nextInt();
            }
        }
        int r1,c1,r2,c2;

        System.out.println("enter the value of r1 coordinate :");
        r1=Sc.nextInt();
        System.out.println("enter the value o c1 coordinate ");
        c1= Sc.nextInt();
        System.out.println("enter the value of r2 coordinate ");
        r2=Sc.nextInt();
        System.out.println("enter the value of c2  coordinate ");
        c2=Sc.nextInt();

        // FUNCTION CALLING 
        prefixSumMatrix(arr);
        int result=SumRegion(arr,r1,c1,r2,c2);
        System.out.println("sum of element of given rectangle is :" + result);

    }
}
