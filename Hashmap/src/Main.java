import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String aa = "abc";
        char[] a = aa.toCharArray();

        String bb = "cde";
        char[] b = bb.toCharArray();

        HashMap<Character,Integer> m = new HashMap<Character,Integer>();

        for(char i : a){
            if(m.containsKey(i)){
                m.put(i,m.get(i)+1); // adds 1 to the frequency if present;

            }
            else{
                m.put(i,1);
            }
        }

        // output a hashmap
        for(Map.Entry e : m.entrySet()){ // learn this syntaxx
            System.out.println(e.getKey()+" "+e.getValue());
        }

        System.out.println();

        String ans = new String();
        for(int i=0;i<b.length;i++){
            if(m.containsKey(b[i])){
                continue;
            }
            else{
                ans = ans + b[i];
            }

        }
        System.out.println(ans);
    }
}