package com.company;

public class Mythread extends Thread {

    String ThreadName ;
    int    SleepTime ;

    public void run() {
        System.out.println("Hi! I'm " + ThreadName + " and I'm going to sleep on " + SleepTime+ " milliseconds" );
        try {
            sleep(SleepTime);
        } catch (InterruptedException e) {}
        System.out.println("Wake up, " + ThreadName + "!" );
    }

    Mythread( String name , float sec ){
        ThreadName = name ;
        SleepTime = (int)( sec * 1000 ) ;
    }

}
