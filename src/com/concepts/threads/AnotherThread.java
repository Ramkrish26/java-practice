package com.concepts.threads;

import static com.concepts.threads.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from "+ currentThread().getName());

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println(ANSI_BLUE+"Another thread woke me up");
            return;
        }
        System.out.println(ANSI_BLUE+"Thread woke up after 5 sec");
    }
}
