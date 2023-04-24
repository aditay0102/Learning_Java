import java.util.*;
public class find_dublicate {
    public static void main(String[] args){
        int[] arr = {1,2,1,3,4,3};
        int k = 3;
        int n = arr.length;

        Arrays.sort(arr);

            for(int j = 0;j<n-1;j++){
                if(arr[j]==arr[j+1]){
                    arr[j] = -1;
                    arr[j+1] = -1;
                }
            }


        for(int i =0;i<n;i++){
            if(arr[i]>0) System.out.print(arr[i]+" ");
        }

    }
}
