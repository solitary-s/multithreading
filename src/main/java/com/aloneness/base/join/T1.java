package com.aloneness.base.join;

public class T1 extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 正在执行中...");
    }
}
