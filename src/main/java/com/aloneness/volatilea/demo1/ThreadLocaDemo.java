package com.aloneness.volatilea.demo1;

public class ThreadLocaDemo extends Thread{

    private Res res;

    public ThreadLocaDemo(Res res) {
        this.res = res;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "----" + res.getNum());
        }
    }

    public static void main(String[] args) {
        Res res = new Res();
        ThreadLocaDemo threadLocaDemo1 = new ThreadLocaDemo(res);
        ThreadLocaDemo threadLocaDemo2 = new ThreadLocaDemo(res);
        ThreadLocaDemo threadLocaDemo3 = new ThreadLocaDemo(res);
        threadLocaDemo1.start();
        threadLocaDemo2.start();
        threadLocaDemo3.start();
    }
}
