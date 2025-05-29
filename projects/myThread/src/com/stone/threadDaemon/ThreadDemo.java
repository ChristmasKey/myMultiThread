package com.stone.threadDaemon;

public class ThreadDemo {

    public static void main(String[] args) {
        /*
            final void setDaemon(boolean on)：将此线程标记为守护线程或用户线程。
            细节：
                当其他的非守护线程执行完毕之后，守护线程会陆续结束
            白话：当女神线程结束了，那么备胎线程也没有存在的必要了
         */
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.setName("女神");
        t2.setName("备胎");

        // 设置守护线程
        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
