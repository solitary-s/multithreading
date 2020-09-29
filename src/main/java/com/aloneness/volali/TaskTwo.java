package com.aloneness.volali;

public class TaskTwo extends Thread{

    @Override
    public void run() {
        while (Count.count > 0) {
            Integer count = Count.getCount().intValue() - 1;
            Count.setCount(count);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("TaskTwo: %s", count));
        }
    }
}
