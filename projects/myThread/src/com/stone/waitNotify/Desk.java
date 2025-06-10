package com.stone.waitNotify;

public class Desk {

    /**
     * 代表桌面，控制生产者和消费者的执行
     */

    // 表示桌面上是否有食物，0表示没有，非0表示有
    public static int foodFlag = 0;

    // 表示消费者可消费的食物数量上限
    public static int count = 10;

    // 锁对象
    public static Object lock = new Object();
}
