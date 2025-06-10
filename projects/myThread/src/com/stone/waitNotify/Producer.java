package com.stone.waitNotify;

public class Producer extends Thread {

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
                    // 如果有，则等待
                    if (Desk.foodFlag == 1) {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        // 如果没有，则生产
                        System.out.println(getName() + "正在生产食物...");
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        // 修改桌子上食物状态
                        Desk.foodFlag = 1;
                        // 生产完之后，唤醒消费者
                        Desk.lock.notifyAll();
                    }
                }
            }

        }
    }
}
