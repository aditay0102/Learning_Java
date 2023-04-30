import java.util.*;

public class multi_array {
    public static void main(String[] args){
        int n = 3;
        int m = 4;

        int[][] arr = new int[n][m];
        Scanner ss = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = ss.nextInt();
            }
        }

        int k =5;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == k){
                    System.out.print("the element is present");
                    break;
                }
            }
            System.out.println(" ");
        }
    }
}
