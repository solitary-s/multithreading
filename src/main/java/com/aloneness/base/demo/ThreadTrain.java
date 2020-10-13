package com.aloneness.base.demo;

/**
 *
 */
public class ThreadTrain implements Runnable{

    private int trainCount = 100;

    @Override
    public void run() {
        while (trainCount > 0) {
            try {
                Thread.sleep(100);
                System.out.println(String.format("%s：出售第%s张票", Thread.currentThread().getName(), (100 - trainCount + 1)));
                trainCount--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadTrain threadTrain1 = new ThreadTrain();
        Thread thread1 = new Thread(threadTrain1, "1号窗口");
        Thread thread2 = new Thread(threadTrain1, "2号窗口");
        thread1.start();
        thread2.start();
    }
}
