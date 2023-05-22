// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static int  sum(int n){
        if(n>0){
            return n + sum(n-1);
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.print(sum(5));

    }

}