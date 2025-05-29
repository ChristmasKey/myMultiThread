package com.stone.threadDaemon;

public class MyThread1 extends Thread{

    @Override
    public void run() {
        // 循环打印1~10的整数
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + " @ " + i);
        }
    }
}
