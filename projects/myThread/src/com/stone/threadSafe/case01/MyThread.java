package com.stone.threadSafe.case01;

public class MyThread extends Thread {

    // 表示这个类所有的对象，都共享ticketNum数据
    static int ticket = 0;

    // 创建锁对象（一定要是唯一的），并通过 static 关键字将其设置为全局唯一的
    // static Object object = new Object();

    @Override
    public void run() {
        while (true) {
            // 同步代码块
            synchronized (MyThread.class) {
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
}
