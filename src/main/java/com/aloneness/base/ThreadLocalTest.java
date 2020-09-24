package com.aloneness.base;

public class ThreadLocalTest {

    static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    static void print(String str) {
        System.out.println(str + " : " + threadLocal.get());
        threadLocal.remove();
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run() {
                threadLocal.set("threadOne");
                print("threadOne");
                System.out.println("remove: " + threadLocal.get());
            }
        });
        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run() {
                threadLocal.set("threadTwo");
                print("threadTwo");
                System.out.println("remove: " + threadLocal.get());
            }
        });
        thread1.start();
        thread2.start();
    }
}
