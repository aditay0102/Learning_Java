public class unsorted_index {
    public static void main(String[] args){
        int n = 6 ;
        int arr[] = {2,6,4,8,2,6};

        for(int i =0;i<n;i++){

            for(int j =0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp  = arr[j];
                    arr[j] = arr[j+1];
                }
            }
        }
    }
}
