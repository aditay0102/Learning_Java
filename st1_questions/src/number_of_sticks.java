public class number_of_sticks {
    public static void main(String[] args){
        // input 1 int[] arr ={4,9,1,32,13};
        int[] arr = {0,4,3,7};
        int n = arr.length;
        // input 1 int k = 13;
        int k =4;

        int count = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }

            if(arr[i] == k){
                count++;
            }
            System.out.print(arr[i]+" ");
            for(int j = i+1;j<n;j++){

                int a = arr[i]+arr[j];
                if(a == k){
                    count++;
                }
            }
        }
        System.out.println();
        System.out.print(count);
    }
}
