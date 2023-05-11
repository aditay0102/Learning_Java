import java.lang.reflect.Array;
import java.util.Arrays;

public class deff {
    public static void main(String[] args){
        String b = "ABCD";
        String a = "ABCDE";

        int l1 = a.length();
        int l2 = b.length();

        int t = Math.min(a.length(),b.length());
        int k = Math.max(a.length(),b.length());


        for(int i = 0;i<t;i++){
            if(a.charAt(i) == b.charAt(i)){
                System.out.print(a.charAt(i));
            }
        }

        System.out.print(" ");

        for(int i=t;i<k;i++){
            if(a.length() > b.length()){
                System.out.print(a.charAt(i));
            }
            else{
                System.out.print(b.charAt(i));
            }
        }




    }


}
