import java.util.Arrays;

public class HIgest_peek {
    public static void main(String[] args){

        int[] arr = {10,20,15,2,010,90,67};
        int n  = arr.length;

        Arrays.sort(arr);
        System.out.print(arr[n-1]);

    }
}
