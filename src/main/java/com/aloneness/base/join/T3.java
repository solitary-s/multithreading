package com.aloneness.base.join;

public class T3 extends Thread{

    private Thread t2;

    public T3(Thread t2) {
        this.t2 = t2;
    }

    @Override
    public void run() {
        try {
            t2.join();
            System.out.println(Thread.currentThread().getName() + " 正在执行中...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.setName("t1");
        T2 t2 = new T2(t1);
        t2.setName("t2");
        T3 t3 = new T3(t2);
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();

//        t1 正在执行中...
//        t2 正在执行中...
//        t3 正在执行中...
    }
}
