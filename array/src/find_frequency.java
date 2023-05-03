public class find_frequency {
    public static void main(String[] args){
        int[] arr = {1,7,4,3,4,1,7};
        int[] fre = new int[arr.length];

        for(int i = 0;i<arr.length;i++){
            int count = 0;
            int start = 0;
            int end = 0;
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]== arr[j]) {
                    start = i;
                    end = j;
                    count++;
                }
            }
            fre[i] = count;
        }

        for(int i =0;i<fre.length;i++){
            System.out.print(fre[i]+" ");
        }

        System.out.print(start)
    }
}
