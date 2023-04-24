public class Sybarray_with_0sum {
    public static void main(String[] args){
        int[] arr = {4,2,-1,1,6};

        int sum = 0;
        for(int i =0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum += arr[j];

                if(sum == 0){
                    System.out.print("yessss");
                }

            }

            sum = 0;
        }
    }
}
