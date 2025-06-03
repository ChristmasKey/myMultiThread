package com.stone.threadSafe.case01;

public class MyThread extends Thread {

    // 表示这个类所有的对象，都共享ticketNum数据
    static int ticket = 0;

    @Override
    public void run() {
        while (true) {
            if (ticket < 100) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticket++;
                System.out.println(getName() + "正在出售第" + ticket + "张票");
            } else break;
        }
    }
}
