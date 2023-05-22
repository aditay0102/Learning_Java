package basic_questions;

public class count_zeroes_digit {
    static int c = 0;
    public static void main(String[] args){

        int n = 010;
        cou(n);
        System.out.print(c);

    }

    static int cou(int n){
        if(n%10 == n){
           return n;
        }
        if(n==0){
            c++;
        }

        if(n%10 == 0){
            c++;
        }
        cou(n/10);
        return 1;
    }
}


