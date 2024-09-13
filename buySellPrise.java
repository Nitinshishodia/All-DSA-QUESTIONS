import java.util.Scanner;
import java.io.*;
public class buySellPrise {
    public static int buyAndSell(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0 ; i<prices.length; i++){
            if(buyPrice< prices[i]){ // profit
            int Profit = prices[i]- buyPrice;
            maxProfit =Math.max(maxProfit, Profit);
        }
        else{
            buyPrice = prices[i];6
        }
    }
    
        return maxProfit;
    }
   public static void main(String[] args) {
    int prices[] = {7,1,5,3,6,4};
    System.out.print(buyAndSell(prices));
   } 
}
