import  java.util.*;
public class find_frequency {
    public static void main(String[] args){
        int[] arr = {1,7,4,3,4,1,7,1,1};
        int[] fre = new int[arr.length];

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println(" ");
        for(int i = 0;i<arr.length;i++){
            int count = 1;

            int end = 0;
            if(i>0&& arr[i-1]==arr[i])
            {
                fre[i] = fre[i-1];
                continue;
            }
            for(int j =i+1;j<arr.length;j++){

                if(arr[i]== arr[j]) {

                    end = j;
                    count++;
                }

            }
            fre[i] = count;
        }

        for(int i =0;i<fre.length;i++){
            System.out.print(fre[i]+" ");
        }


    }
}
