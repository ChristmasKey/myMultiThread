package com.stone.threadSafe.case01;

public class MyThread extends Thread {

    // 表示这个类所有的对象，都共享ticketNum数据
    static int ticketNum = 1;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 100) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + "正在出售第" + ticketNum + "张票");
                ticketNum++;
            } else break;
        }
    }
}
