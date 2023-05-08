public class ss {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };


        int n = arr.length;
        n = n * n;
        System.out.print(n);

        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]);
        }

    }

}