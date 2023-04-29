
class obj{
    int a;
    int b;

    void swap(){
        int temp  = a;
        a = b;
        b = temp;

        System.out.print("a is "+a + " b is "+ b);
    }

}

public class swap {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        obj n = new obj();
        n.a = 10;
        n.b = 20;

        n.swap();
    }
}
