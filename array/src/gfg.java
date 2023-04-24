
public class gfg {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        // output  = 0,1,2;

        for(int i =0;i<arr.length;i++){
        int sum = 0;
            for(int j =0;j<arr.length;j++){
                if(arr[j] <arr[i]){
                    sum+=arr[i];
                }

            }
            System.out.print(sum+" ");
        }
    }
}
