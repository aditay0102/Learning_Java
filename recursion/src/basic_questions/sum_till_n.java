package basic_questions;

public class sum_till_n {

    public static void main(String[] args){
        int n = 5;
        int ans = sum(n);
        System.out.print(ans);
    }


    static int sum(int n){
        if(n <= 1){
            return 1;
        }
        return n + sum(n-1);
    }

}
