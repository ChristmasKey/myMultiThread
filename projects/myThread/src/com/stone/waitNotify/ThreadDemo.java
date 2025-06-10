package com.stone.waitNotify;

public class ThreadDemo {

    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        producer.setName("厨师");
        consumer.setName("食客");
        producer.start();
        consumer.start();
    }
}
