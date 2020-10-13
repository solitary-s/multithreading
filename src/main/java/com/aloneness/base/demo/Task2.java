package com.aloneness.base.demo;

public class Task2 implements Runnable{

    private Count count;

    public Task2(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            count.minus();
            System.out.println(Thread.currentThread().getName() + " : " + count.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
