

public class Main {

    public static void main(String[] args) {
       int n = 6;
       int[] arr = new int[n];

       for(int i =0;i<n;i++){
           arr[i] = i+1;
       }
       for(int i =0;i<n;i++){
           if(arr[i]%2 == 0){
              int temp = arr[i];
              arr[i] = arr[i+1];
              arr[i+1] = temp;
               }
           }
       }

       for(int i = 0;i<n;i++){
           System.out.print(arr[i]+" ");
       }

    }
}