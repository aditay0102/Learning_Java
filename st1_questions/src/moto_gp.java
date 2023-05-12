import java.lang.Math;

public class moto_gp {
    public static void main(String[] args){
        //int[] arr = {4,9,1,32,13};
        int[] arr = {21,1,9};
        int n = arr.length;
        int mx = 0;

        for(int i =0;i<n;i++){

            for(int j = i+1;j<n;j++){
                int a = arr[i] - arr[j];
                a = Math.abs(a);
                if(mx== 0 && a>0){
                    mx = a;
                }
                if(a<mx){
                    mx = a;
                }

                //System.out.print(mx+" ");
            }

        }
        System.out.print(" "+mx);

    }
}
