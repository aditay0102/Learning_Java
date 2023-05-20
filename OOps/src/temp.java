public class temp {
    public static void main(String[] args){
        int[] arr = {};
        int s = 0;
        int e = arr.length - 1;
        System.out.print(" e is "+ e);

        int x = 0 , a = 0 , count = 0 , i = 0;
        while(s<e){
            int temp  = arr[a]; // 1
            a  = a + temp; // 0 + 1 = 1;
            count++;
            if(a>=e){

                break;
            }


        }
       System.out.print(count+" ");

    }
}
