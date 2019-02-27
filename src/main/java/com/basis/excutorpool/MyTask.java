package com.basis.excutorpool;

public class MyTask implements Runnable{
    private int num;

    public MyTask() {

    }

    public MyTask(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("正在执行任务"+ num);
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程"+num+"任务执行完成");
    }
}
