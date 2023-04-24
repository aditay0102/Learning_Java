public class Expand_arrray {
    public static void main(String[] args) {
        int n = 5;
        int pos = 5;
        int k = 99;

        int[] arr = new int[n];
         arr = new int[]{1, 2, 3, 4, 5};

         for(int i=n-1;i>=pos;i--){
             arr[i] = arr[i-1];
             n++;
         }
        arr[pos-1] = k;

         for(int i = 0;i<n;i++){
             System.out.print(arr[i]+" ");
         }
    }
}