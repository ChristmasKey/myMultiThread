package com.stone.threadSafe.deadLock;

public class MyThread extends Thread {

    static final Object objA = new Object();
    static final Object objB = new Object();

    @Override
    public void run() {
        while (true) {
            if ("线程A".equals(getName())) {
                synchronized (objA) {
                    System.out.println("线程A获取了A锁");
                    synchronized (objB) {
                        System.out.println("线程A获取了B锁，顺利执行完一轮");
                    }
                }
            } else if ("线程B".equals(getName())) {
                synchronized (objB) {
                    System.out.println("线程B获取了B锁");
                    synchronized (objA) {
                        System.out.println("线程B获取了A锁，顺利执行完一轮");
                    }
                }
            }
        }
    }
}
