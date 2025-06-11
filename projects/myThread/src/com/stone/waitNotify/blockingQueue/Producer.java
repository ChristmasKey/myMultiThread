package com.stone.waitNotify.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer extends Thread {

    private ArrayBlockingQueue<String> queue;

    public Producer(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            // 不断向阻塞队列中添加数据
            try {
                queue.put("面条"); // put方法中已经被加锁了，所以不需要我们自己再额外加锁
                System.out.println("生产者生产了面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
