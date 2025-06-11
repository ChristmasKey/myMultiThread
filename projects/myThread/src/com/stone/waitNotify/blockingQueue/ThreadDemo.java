package com.stone.waitNotify.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {

    public static void main(String[] args) {
        /*
            需求：利用阻塞队列实现生产者和消费者（等待唤醒机制）的代码
            细节：
                生产者和消费者必须使用同一个阻塞队列
         */
        // 创建阻塞队列
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        // 创建线程对象，并把阻塞队列传递过去
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        // 启动线程
        producer.start();
        consumer.start();
    }
}
