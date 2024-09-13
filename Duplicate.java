public class Duplicate {
    public static void main(String[] args) {
        int arr[]={2,3,3,4};
     int n=arr.length;
     for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            if(arr[i]==arr[j])
            {
            System.out.println("Duplicate element found at:" +arr[i]);
            }
     }
    }
}
}
