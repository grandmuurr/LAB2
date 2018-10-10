package com.company;

public class Main {

    public static void main(String[] args) {

        Mythread mythread1 = new Mythread( "Thread A" , 2.1F );
        Mythread mythread2 = new Mythread( "Thread B" , 4.3F );
        Mythread mythread3 = new Mythread( "Thread C" , 7.0F );


        System.out.println("It's main thread: " + Thread.currentThread().getName() );

        mythread1.start();
        mythread2.start();
        mythread3.start();

        for (int i = 0; i < 10; i++) {
            System.out.println( "i = " + i );
            try {
                Thread.sleep(999);
            } catch (InterruptedException e) {}
        }



    }
}
