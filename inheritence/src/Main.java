// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
       Smm ss = new Smm();
       ss.roll = 102;
       ss.name = "Aditya";
       ss.english = 99;
       ss.math = 100;
       ss.sience = 98;
       ss.sum1();

       Smm s2 = new Smm();
       s2.sum2();

        Sm2 a = new Sm2();
        a.fres();

    }
}

class student{
    int roll;
    String name;

    int english;
    int math;
    int sience;

    int sm1;
    void sum1(){
        sm1 = english + math + sience;
        System.out.println("sm1 is "+ sm1);
    }
    student(){

    }

}

class Smm extends student {
    int sm2;
    void sum2(){
        sm2 = sm1 + 100;
        System.out.println("sm2 is "+ sm2);
    }
}

class Sm2 extends Smm{
    int result;
    void fres(){
        result = sm1 + sm2;
        System.out.print(result);
    }
}