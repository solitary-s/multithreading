package com.aloneness.volatilea;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Count {

    public static Integer count = 100;

    public static synchronized void setCount(Integer count) {
        Count.count = count;
    }

    public static Integer getCount() {
        return count;
    }

    private static final List<String> list = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
//        TaskOne taskOne = new TaskOne();
//        TaskTwo taskTwo = new TaskTwo();
//        taskOne.start();
//        taskTwo.start();
        System.out.println(LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli());
    }
}
