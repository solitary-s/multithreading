package com.aloneness.base.join;

public class Task implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 正在执行中...");
    }

    public static void main(String[] args) {
        Task task = new Task();
        Thread thread1 = new Thread(task, "T1");
        Thread thread2 = new Thread(task, "T2");
        Thread thread3 = new Thread(task, "T3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
