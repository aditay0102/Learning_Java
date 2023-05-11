public class palindrom_string {
    public static void main(String[] args){
        String s= "abba";
        String rev = "";
        char ch ;
        for(int i = 0;i<s.length();i++){
            ch = s.charAt(i);
            rev = ch + rev;
        }
        System.out.print(rev);

        if(s == rev){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
