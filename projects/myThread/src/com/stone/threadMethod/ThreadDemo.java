package com.stone.threadMethod;

public class ThreadDemo {
    /*
        String getName()：获取当前线程的名字
        void setName(String name)：设置当前线程的名字
        细节：
            1、线程的默认名称格式：Thread-X（X是序号，从0开始）
            2、除了setter方法，我们还可以通过构造方法给线程设置名称（需要在子类中通过super调用Thread父类的构造方法）

        static Thread currentThread()：获取当前线程对象
        细节：
            当JVM虚拟机启动之后，会自动的启动多条线程
            其中有一条线程就叫做main线程
            它的作用就是去调用main方法，并执行其中代码
            所以，写在main方法中的所有代码，其实都是运行在main线程中的

        static void sleep(long time)：让线程休眠指定的时间，单位为毫秒
        细节：
            1、当某条线程执行到此方法，则该线程就会在这里停止运行对应的时间
            2、方法的参数：表示线程睡眠的时间，单位是毫秒
            3、当睡眠对应的时间后，线程会自动唤醒，继续执行下面的任务代码
     */

    public static void main(String[] args) throws InterruptedException {
        // 创建线程对象
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread("线程2");
        // 开启线程
        t1.start();
        t2.start();

        // // 获取执行main方法的线程对象
        // Thread thread = Thread.currentThread();
        // System.out.println(thread.getName());
        //
        // // 让当前线程休眠5秒
        // Thread.sleep(5000);
        // System.out.println("main方法执行完毕");
    }
}
