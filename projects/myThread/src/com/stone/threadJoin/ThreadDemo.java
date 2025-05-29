package com.stone.threadJoin;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        /*
            public final void join()：插入线程/插队线程；等待线程终止；等待调用join方法的线程执行结束。
         */
        MyThread myThread = new MyThread();
        myThread.setName("土豆");
        myThread.start();

        // 将myThread线程插入到当前线程（这里是main线程）之前运行
        myThread.join();

        for (int i = 0; i < 10; i++) {
            System.out.println("main线程 " + i);
        }
    }
}
