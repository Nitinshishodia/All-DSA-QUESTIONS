import java.util.Scanner;
public class arraysSortColour {
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
       int n = nums.length;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if(nums[j] > nums[j+1]){
                    // swap the values
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    
        }
      
                }
                System.out.println(nums[i]);
            }
            
        
    }
}
