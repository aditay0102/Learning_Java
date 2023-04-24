public class stocks {
    public static void main(String[] args){
        //int[] arr = {100,180,256,310,40,535,695};
        int[] arr = {2,4,1};
        int n = arr.length;

        int result = 0;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
               // ans1 =  arr[i] - arr[0];
              //  ans2 = arr[n-1] - arr[i+1];
                result = 1;
                break;
            }
        }

        if(result == 1){
            System.out.print(1);
        }
        else {
            System.out.println("No Profit");
        }
    }
}
