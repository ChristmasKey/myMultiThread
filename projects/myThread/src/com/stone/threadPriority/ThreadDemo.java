package com.stone.threadPriority;

public class ThreadDemo {

    public static void main(String[] args) {
        /*
            setPriority(int newPriority)：设置线程优先级
            final int getPriority()：获取线程优先级
         */

        // 创建线程任务对象
        MyRunnable myRunnable = new MyRunnable();
        // 创建线程对象
        Thread t1 = new Thread(myRunnable, "线程1");
        Thread t2 = new Thread(myRunnable, "线程2");

        // 获取线程优先级
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        // 设置线程优先级
        t1.setPriority(10);
        t2.setPriority(1);

        // 启动线程
        t1.start();
        t2.start();

        // 获取main线程的优先级：默认也是5
        // System.out.println(Thread.currentThread().getPriority());
    }
}
