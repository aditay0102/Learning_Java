// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class reverse_string {



    public static void main(String[] args) {
        String  s = "aditya";
        String rev = "";
        char ch ;
        for(int i = 0;i<s.length();i++){
            ch = s.charAt(i);
            rev = ch + rev;
        }
        System.out.print(rev);

    }
}