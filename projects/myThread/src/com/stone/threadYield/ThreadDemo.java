package com.stone.threadYield;

public class ThreadDemo {

    public static void main(String[] args) {
        /*
            public static void yield()：出让线程/礼让线程；暂停当前正在执行的线程对象，并执行其他线程。
         */
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
