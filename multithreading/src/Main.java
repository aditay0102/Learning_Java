// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

class evenThread implements Runnable{
    int n;
    evenThread(int n){
        this.n = n;
    }

    public void run(){
        // task for thread;

        for(int i=0;i<n;i= i+2){
            System.out.println("the value is "+i);
        }
    }

}

class oddThread extends Thread  {
    int n;
    oddThread(int n){
        this.n = n;
    }
    public void run(){
        for(int i = 1;i<10;i=i+2){
            System.out.println("the odd value is "+i);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        // create object of my thread;
        evenThread t1  =  new evenThread(n);
        Thread thr = new Thread(t1);

        oddThread t2 = new oddThread(n);



        thr.start();
        t2.start();

    }
}