package basic_questions;

public class reverse_num {
    public static void main(String[] args){
        /*
        int n = 123;
        int ans = revv(n);

        System.out.print(ans);
        */

        int sum = 0;
         revv(123);
         System.out.print(r);
    }
    static  int r = 0;

    static void  rev(int n){
        if(n%10 == n){
            System.out.print(n);
            return;
        }
        System.out.print(n%10);
        rev(n/10);
    }

    static void revv(int n ){
        if(n%10 == 0){
            return;
        }
       int rem  = n%10;
        r = r * 10 + rem;
        revv(n/10);
    }


}
