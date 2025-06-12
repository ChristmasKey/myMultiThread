package com.stone.practice.case01;

public class ThreadDemo {

    public static void main(String[] args) {
        /*
        一共有1000张电影票，可以在两个窗口领取，假设每次领取的时间为3000毫秒，要求：请用多线程模拟买票过程，并打印剩余电影票的数量。
         */
        WindowThread window1 = new WindowThread();
        WindowThread window2 = new WindowThread();
        window1.setName("窗口1");
        window2.setName("窗口2");
        window1.start();
        window2.start();
    }
}
