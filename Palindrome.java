public class Palindrome {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1};
    
        int n=arr.length;
        int ans=0;
        for(int i=0; i<n/2; i++){
            if(arr[i]!= arr[n-i-1]){
                ans=1;
                System.out.println("not a palindrome array ");
                break;    
            }
        }
        if(ans==0){
            System.out.println("palindrome array");
         }
     }
    
}
