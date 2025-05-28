package com.stone.case01;

public class ThreadDemo {

    public static void main(String[] args) {
        /*
        多线程的第一种启动方式
          1.自己定义一个类继承Thread类
          2.重写run方法
          3.创建子类对象并调用start方法启动线程
         */

        MyThread myThread1 = new MyThread();
        myThread1.setName("线程1");
        myThread1.start();
        MyThread myThread2 = new MyThread();
        myThread2.setName("线程2");
        myThread2.start();
    }
}
