package com.stone.threadDaemon;

public class MyThread2 extends Thread {

    @Override
    public void run() {
        // 循环打印1~100的整数
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName() + " @ " + i);
        }
    }
}
