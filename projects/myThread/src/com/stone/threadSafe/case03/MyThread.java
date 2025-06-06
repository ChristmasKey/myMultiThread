package com.stone.threadSafe.case03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

    static int ticket = 0;

    // 利用 static 关键字保证锁对象的唯一性
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            // 手动加锁
            lock.lock();
            try {
                if (ticket == 100) {
                    break;
                } else {
                    Thread.sleep(100);
                    ticket++;
                    System.out.println(getName() + "卖出第" + ticket + "张票");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally { // 利用finally关键字保证释放锁的操作一定会被执行，即使break跳出循环外，否则程序不会正常退出
                // 手动释放锁
                lock.unlock();
            }
        }
    }
}
