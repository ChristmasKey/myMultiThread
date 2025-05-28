package com.stone.case01;

public class MyThread extends Thread{

    @Override
    public void run() {
        // 线程执行代码：循环打印100次Hello World
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + " Hello World");
        }
    }
}
