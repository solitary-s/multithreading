package com.aloneness.base.demo;

public class Count {

    private Integer count = 100;

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public synchronized void inc() {
        count++;
        System.out.println(count);
    }

    public synchronized void minus() {
        System.out.println(count);
        count--;
    }
}
