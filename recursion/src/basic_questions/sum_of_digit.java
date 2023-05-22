package basic_questions;

public class sum_of_digit {
    public static void main(String[] args){
        int n = 1234;
        int ans = sumdig(n);
        System.out.print(ans);
    }

    static int sumdig(int n){
        if(n == 0){ // for product   if ( n%10 == n) return n;
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return sumdig(n/10) + n%10; // same code product just replace + with *;
    }

}
