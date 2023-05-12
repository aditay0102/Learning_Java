// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Find_Triplets {
    public static void main(String[] args) {
        int[] arr ={2,6,4,8};// output == 2;
        int n = arr.length;
        int count = 0;

        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int com = arr[i]+arr[j];
                for(int k = 0;k<n;k++){
                    if(com == arr[k]){
                        count++;
                    }
                }
            }
        }

        System.out.print(count);
    }
}