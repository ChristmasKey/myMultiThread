package com.stone.case02;

public class MyRun implements Runnable {

    @Override
    public void run() {
        // 线程执行代码：循环打印100次Hello World
        for (int i = 0; i < 100; i++) {
            // 获取当前正在执行任务的线程对象
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getName() + " Hello World");
        }
    }
}
