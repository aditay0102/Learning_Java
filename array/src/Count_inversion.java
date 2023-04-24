import java.util.*;
public class Count_inversion {

    public static void main(String[] args){
        int n = 3;
        int[] arr = new int[n];
        arr = new int[]{10,10,10};

        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmep = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmep;
                    count++;
                }
            }
        }

        System.out.println("count"+count);
    }
}
