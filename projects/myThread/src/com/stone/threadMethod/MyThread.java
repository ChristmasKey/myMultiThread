package com.stone.threadMethod;

public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // 继承了Thread类后，异常无法被抛出，只能被try-catch
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                // throw new RuntimeException(e);
            }
            System.out.println(getName() + " @" + i);
        }
    }
}
