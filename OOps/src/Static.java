
class Human{
    int age;
    String name;
    String profession;
    Human(int Age,String naam,String kaam){
        this.age = Age;
        this.name = naam;
        this.profession = kaam;
    }
}

public class Static {
    public static void main(String[] args){
        Human h1  = new Human(19,"Rahul", "bhabi lover");
        System.out.print(h1.profession);
    }
}
