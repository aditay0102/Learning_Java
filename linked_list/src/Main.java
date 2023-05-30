import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    /*       singley linked list
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(99);
        list.insertLast(200);


        list.display();

        //list.deleteLast();
        list.deleteindex(1);
        System.out.println();
        list.display();
*/

        DLL l = new DLL();
        l.insertFirst(1);
        l.insertFirst(3);
        l.insertFirst(5);
        l.displayRev();

    }
}