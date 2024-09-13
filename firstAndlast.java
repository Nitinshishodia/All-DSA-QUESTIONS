import java.util.Scanner;
public class firstAndlast {
    public static void printElements(int nums[], int target){
        for(int i =0 ; i<nums.length; i++){
            for(int j =i+1 ; j<nums.length; j++){
                if(nums[i]== target && nums[j] == target){
                    System.out.print("[ " +i + " , "+ j + " ]");
                }
                System.out.println();
            }
        }
        
    }
    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        // function calling
        printElements(nums, target);
    }
}
