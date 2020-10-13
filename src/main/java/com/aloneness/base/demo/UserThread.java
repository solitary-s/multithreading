package com.aloneness.base.demo;

import java.util.List;

public class UserThread extends Thread{

    private List<UserEntity> list;

    public UserThread(List<UserEntity> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (UserEntity userEntity : list) {
            System.out.println("threadName: " + Thread.currentThread().getName() + "学员编号" + userEntity.getUserId() + "学员姓名： " + userEntity.getUserName());
        }
    }
}
