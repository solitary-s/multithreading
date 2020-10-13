package com.aloneness.base.demo;

public class Task1 implements Runnable{

    private Count count;

    public Task1(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            count.inc();
            System.out.println(Thread.currentThread().getName() + " : " + count.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
