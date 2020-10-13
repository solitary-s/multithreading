package com.aloneness.base.demo;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Task1 task1 = new Task1(count);
        Task2 task2 = new Task2(count);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task2);
        Thread thread4 = new Thread(task1);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " : " + count.getCount());
    }
}
