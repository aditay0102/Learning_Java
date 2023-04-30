


//   use main.java for its a to see this working
public class singleton {

    private singleton(){

    }
    private static singleton instance;

    public static singleton getInstance(){
        // check only 1 object is created;
        if(instance == null){
            instance = new singleton();
        }
        return instance;
    }
}


