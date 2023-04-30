public class constructor {
    public static void main(String[] args) {
        Sstudent adi = new Sstudent(102, "Aditya", 99);
        System.out.println(adi.rollno);
        System.out.println(adi.name);
        System.out.println(adi.marks);

        adi.changename("Aditya");
        adi.greeting();
    }
}

class Sstudent{
    int rollno;
    String name;
    float marks;

    // we need a way to add the value of the above
    // properties   object by object

    // we need one word to access every object

    void greeting(){
        System.out.println("Hello! My name is " + name);
    }

    void changename(String newname){
        this.name = newname;
    }
    Sstudent(){
        this.rollno = 0;
        this.name = "N/A";
        this.marks = 0.0f;
    }

    Sstudent(int roll , String nm, float mks){
        this.rollno = roll;
        this.name = nm;
        this.marks = mks;
    }
}