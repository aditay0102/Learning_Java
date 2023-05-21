
import java.util.*;

public class sort_string {
    public static void main(String[] args){
        String a = "cba";
        String b = "bca";


        char arr[] = a.toCharArray();
        char brr[] = b.toCharArray();


        Arrays.sort(brr);
        Arrays.sort(arr);

        String ans = new String(arr);
        String bns = new String(brr);

        if(ans.equals(bns)){
            System.out.print("Yes");
        }


        System.out.print(bns);
    }



}
