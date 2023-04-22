import java.util.*;

//      SIMPLE LINEAR SEARCH man ------------------------------ ---- - - - --

public class linear_search {
    public static void main(String[] args) {
        Scanner cin  = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,99,5,4,3};
        int k = 99;

        for (int i = 0; i <= arr.length-1; i++) {
            if(arr[i] == k){
                System.out.println(i);
            }
        }
    }
}