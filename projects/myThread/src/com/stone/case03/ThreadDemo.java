package com.stone.case03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        多线程的第三种实现方式：可以获取到多线程的运行结果
          1.自己定义一个类实现Callable接口
          2.重写call()方法，该方法有返回值，可以获取到多线程的运行结果
          3.创建Callable接口实现类的对象（表示多线程要执行的任务）
          4.创建FutureTask对象，将Callable接口实现类的对象作为参数传递给FutureTask的构造方法
            FutureTask类是Future接口的实现类，用来管理多线程运行的结果
          5.创建Thread对象，将FutureTask对象作为参数传递给Thread的构造方法，并启动线程
         */

        // 创建MyCallable对象，表示多线程要执行的任务
        MyCallable myCallable = new MyCallable();
        // 创建FutureTask对象，用来管理多线程运行的结果
        FutureTask<Integer> futureTask = new FutureTask<>(myCallable);
        // 创建Thread对象
        Thread t1 = new Thread(futureTask);
        // 启动线程
        t1.start();

        // 获取多线程的运行结果
        Integer result = futureTask.get();
        System.out.println("多线程的运行结果：" + result);
    }
}
