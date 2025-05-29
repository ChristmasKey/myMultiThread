package com.stone.case02;

public class ThreadDemo {

    public static void main(String[] args) {
        /*
        多线程的第二种启动方式
          1.自己定义一个类实现Runnable接口
          2.重写run方法
          3.创建Runnable接口实现类的对象
          4.创建Thread类的对象，将Runnable接口实现类的对象
            作为参数传递给Thread类的构造方法，并开启线程
         */

        // 创建MyRun对象，表示多线程要执行的任务
        MyRun myRun = new MyRun();
        // 创建线程对象
        Thread t1 = new Thread(myRun);
        Thread t2 = new Thread(myRun);
        // 设置线程名称
        t1.setName("t1");
        t2.setName("t2");
        // 开启线程
        t1.start();
        t2.start();
    }
}
