package com.aloneness.volatilea.demo;

public class ThreadVolatileDemo extends Thread{

    public volatile boolean flag = true;

    @Override
    public void run() {
        System.out.println("开始执行子线程...");
        while (flag) {

        }
        System.out.println("线程停止");
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadVolatileDemo threadVolatileDemo = new ThreadVolatileDemo();
        threadVolatileDemo.start();
        Thread.sleep(3000);
        threadVolatileDemo.setFlag(false);
        System.out.println("flag 已经设置成false");
        Thread.sleep(1000);
        System.out.println(threadVolatileDemo.flag);
    }
}
