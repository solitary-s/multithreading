package com.aloneness.base.join;

public class T2 extends Thread{

    private Thread t1;

    public T2(Thread t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        try {
            t1.join();
            System.out.println(Thread.currentThread().getName() + " 正在执行中...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
