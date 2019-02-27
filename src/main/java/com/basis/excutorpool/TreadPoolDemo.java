package com.basis.excutorpool;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池的四个要素
 * 1.线程池管理器：用来创建线程，销毁线程，添加任务
 * 2.工作线程:线程池中的线程，在没有工作的时候处于等待状态，可循环的执行任务
 * 3.任务接口:每一个任务必须实现的接口,可以让工作线程调度
 * 4.任务队列：用于存放没有执行的任务，缓冲机制
 */
public class TreadPoolDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,10,200,
                TimeUnit.MILLISECONDS,new ArrayBlockingQueue<>(5));
        for(int i=0;i<15;i++){
            executor.execute(new MyTask(i));
            System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
                    executor.getQueue().size()+"，已执行玩别的任务数目："+executor.getCompletedTaskCount());
        }
        executor.shutdown();
    }
}
