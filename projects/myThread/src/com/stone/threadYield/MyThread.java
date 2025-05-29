package com.stone.threadYield;

public class MyThread extends Thread {

    @Override
    public void run() {
        // 循环打印1~100的整数
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName() + " @ " + i);
            // 表示出让当前CPU的执行权
            Thread.yield();
        }
    }
}
