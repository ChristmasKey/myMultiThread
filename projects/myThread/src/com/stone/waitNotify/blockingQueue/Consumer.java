package com.stone.waitNotify.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer extends Thread {

    private ArrayBlockingQueue<String> queue;

    public Consumer(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            // 不断从阻塞队列中提取数据
            try {
                String food = queue.take(); // take方法中已经被加锁了，所以不需要我们自己再额外加锁
                System.out.println("消费者消费了：" + food);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
