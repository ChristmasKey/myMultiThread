package com.stone.threadSafe.case02;

public class MyRunnable implements Runnable {

    // 通过Runnable接口实现的线程类，不需要将共享数据设为静态的
    // 因为该类的对象会作为共同参数传给每个线程对象
    int ticket = 0;

    @Override
    public void run() {
        while (true) {
            if (saleTicket()) break;
        }

    }

    // 将同步代码块抽为同步方法
    // 对于非静态类方法，其锁对象为 this
    private synchronized boolean saleTicket() {
        if (ticket == 100) return true;
        else {
            ticket++;
            System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票");
            return false;
        }
    }
}
