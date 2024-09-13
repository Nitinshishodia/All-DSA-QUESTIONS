import java.util.Scanner;
import java.io.*;
public class recursionTillingProbleam {
    public static int tillingProbleam(int n){
        // base case
        if( n == 0 || n == 1){
            return 1;
        }
        // kaam 
        // vertically 
        int fnm1 = tillingProbleam(n-1);

        // horizontally
        int fnm2 = tillingProbleam(n-2);

        // totalWays 
        int totalWays = fnm1 + fnm2;

        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tillingProbleam(5));
    }
}
