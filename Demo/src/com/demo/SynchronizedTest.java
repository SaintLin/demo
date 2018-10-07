package com.demo;

public class SynchronizedTest implements Runnable {

    static SynchronizedTest instance;

    static int i = 0;

    @Override
    public void run() {

        synchronized (this) {
            for (int j = 0; j < 1000000; j++) {
                i++;
            }
        }

    }

    public static void main(String[] asg) throws InterruptedException {
        Thread t1 = new Thread(new SynchronizedTest());
        Thread t2 = new Thread(new SynchronizedTest());

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(i);
    }

}
