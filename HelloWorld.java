class HelloWorld {
    public static void maxSubArraySum(int arr[]){
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length; i++){
            int start = i;
            for(int j = i; j<arr.length; j++){
               int end = j;
               for(int k = start ; k<=end; k++){
                currSum+=arr[k];
               }
               System.out.println(currSum);
               if(max < currSum){
                max = currSum;
               } 
            }
        }
        System.out.println("maximum sum of subarray is  " + max);

    }
    public static void main(String[] args) {
    int arr[] = {1,-2,6,-1,3};
    maxSubArraySum(arr);
    }
}
