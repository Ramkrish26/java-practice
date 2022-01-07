package com.concepts.threads;

import static com.concepts.threads.ThreadColor.ANSI_GREEN;
import static com.concepts.threads.ThreadColor.ANSI_PURPLE;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("====Another thread====");
        anotherThread.start();

        // Creating thread using anonymous class
        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN+"Hello from anonymous class thread");
                try{
                    anotherThread.join();
                    System.out.println(ANSI_GREEN+"Another terminated so i am running again");
                }catch (InterruptedException e){
                    System.out.println(ANSI_GREEN+"I was interrupted");
                }
            }
        }.start();

        Thread myRunnableThread = new Thread(new ByRunnable());
        myRunnableThread.start();


//        anotherThread.interrupt();
    }
}
