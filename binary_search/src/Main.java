import java.lang.reflect.GenericDeclaration;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int[] arr = {2,3,4,15,16,18,22,45,89};
       // int ans = binarySearch(arr,45);
        int ans = orderAgnosticBS(arr,45);

        System.out.println(ans);


    }

    //return the index
    // return -1 if it does not exits;
    static int binarySearch(int[] arr,int target){
        int s = 0;// start
        int e = arr.length -1; // end

        while(s<=e){
            // find the middle element
           // int mid = (s+e)/2; might be possible that s+e  exceeds the range of int
            int mid = s + (e-s) / 2; // good formula

            if(target< arr[mid]){// it lies of the left side
                e = mid-1;
            }
            else if(target > arr[mid]){
                s = mid+1;

            }
            else{
                // ans;
                return mid;
            }

        }

        return -1;
    }

    //  order Agnostic BS is used when we dont know that array is sorted in asc or dsc
    static int orderAgnosticBS(int[] arr,int target){
        int s =0;//start
        int e = arr.length-1;

        // find  the array is in ascending order or decending
        boolean isAsc  = arr[s]<arr[e];

        while(s<e){
            int mid = s + (e-s)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target<mid){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
            else{
                if(target<mid){
                    s = mid+1;
                }
                else{
                    e = mid -1;
                }
            }
        }

        return -1;
    }

}