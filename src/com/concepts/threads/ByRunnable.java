package com.concepts.threads;

import static com.concepts.threads.ThreadColor.ANSI_RED;

public class ByRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(ANSI_RED+"Thread from runnable");
    }
}
