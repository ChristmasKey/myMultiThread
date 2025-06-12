package com.stone.practice.case01;

public class WindowThread extends Thread {

    private static int ticket = 1000;

    private final static Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (ticket == 0) break;
                else {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println(getName() + "售出一张电影票，剩余电影票" + ticket + "张");
                }
            }
        }
    }
}
