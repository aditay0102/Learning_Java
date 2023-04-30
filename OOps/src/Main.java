// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        student s1 = new student();
        s1.rollno = 102;
        s1.name = "Aditya";

        System.out.print(s1.name);

    }
}

class student{
    int rollno;
    String name;
    float marks;
}