package com.aloneness.volatilea;

public class TaskOne extends Thread{

    @Override
    public void run() {
        while (Count.getCount() > 0) {
            Integer count = Count.getCount().intValue() - 1;
            Count.setCount(count);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("TaskOne: %s", count));
        }
    }
}
