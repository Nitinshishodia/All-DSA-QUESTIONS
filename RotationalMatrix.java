import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class RotationalMatrix {
    public static void rotatedMatrix(int arr[][]){
        // STEP 1: TRANSPOSE THE 2D ARRAY
        int m=arr.length;
        int n=arr[0].length;

        for(int i=0; i<m; i++){
            for(int j=i; j<n; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        // STEP 2: SWAP THE LEFT AND RIGHT SIDE ELEMENT.
        for(int i=0; i<m; i++){
        int li=0;
        int ri=n-1;
        while(li<ri){
            int temp=arr[i][li];
            arr[i][li]=arr[i][ri];
            arr[i][ri]=temp;
            li++;
            ri--;
        }
        }
    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        

        // Function Calling
        rotatedMatrix(arr);
        for(var mat: arr){
            System.out.println(Arrays.toString(mat));
        }
    }
}
