
import java.util.*;

public class temp {
    public static void main(String[] args){
        int[] a = {1,2,3,2,1};
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();

        for(int i : a){
            if(m.containsKey(i)){
                m.put(i,m.get(i)+1);

            }
            else{
                m.put(i,1);
            }
        }

        // iterating a hashmap
        for(Map.Entry e : m.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
