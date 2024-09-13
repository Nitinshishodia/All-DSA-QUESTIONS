import java.util.Scanner;
public class recursionDecreasing {
    
    //public static void decreasingOrder(int n){
    //     // base case condition
    //     if(n == 1){
    //         System.out.println(1);
    //         return;
    //     }
    //     System.out.println(n + " ");
    //     decreasingOrder(n-1);
    // }
    public static void increasingOrder(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        increasingOrder(n-1);
        System.out.println(n);
       
    }

    public static void main(String[] args) {
        int n = 5;
       // decreasingOrder(10);
       increasingOrder(n);
        
    }
}
