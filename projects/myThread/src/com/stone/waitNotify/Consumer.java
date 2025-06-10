package com.stone.waitNotify;

public class Consumer extends Thread {

    @Override
    public void run() {
        /*
            1.循环
            2.同步代码块
            3.判断共享数据是否到了末尾（到了末尾）
            4.判断共享数据是否到了末尾（没到末尾，执行核心逻辑）
         */
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) break;
                else {
                    // 先判断桌子上是否有食物
                    // 如果没有，则等待
                    if (Desk.foodFlag == 0) {
                        try {
                            Desk.lock.wait(); // 让当前线程与锁对象进行绑定
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        // 将可消费的食物数量上限-1
                        Desk.count--;
                        // 如果有，则消费
                        System.out.println(getName() + "正在消费食物，还能再消费" + Desk.count + "碗！");
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        // 消费完之后，唤醒生产者
                        Desk.lock.notifyAll(); // 唤醒所有与锁对象绑定的线程
                        // 修改桌子上食物状态
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }
}
