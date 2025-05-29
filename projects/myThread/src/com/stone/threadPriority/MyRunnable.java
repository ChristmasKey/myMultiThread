package com.stone.threadPriority;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        // 打印1~100的整数
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
