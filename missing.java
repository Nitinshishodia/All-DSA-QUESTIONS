public class missing {
    public static void main(String[] args) {
        int arr[]={1,2,3,7,6,5};
        int n=arr.length;
        // sum of natural numbers in an array.
        int sum_natural_num=((n+1)*(n+2))/2;
        int sum=0;
        // sum of current element in an array.
        for(int i=0; i<n; i++){
            sum=sum+arr[i];
        }
        int missing_elem=0;
       missing_elem=sum_natural_num-sum;
       System.out.println("missing element in an array is :" + missing_elem);
    }
}
