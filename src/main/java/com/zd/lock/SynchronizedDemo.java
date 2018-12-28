package com.zd.lock;

/**
 * 串行  并行  synchronized 之后 可以串行执行
 * 线程的类的创建形式
 * 1.implements Runnable
 * 2.extends Thread
 */
public class SynchronizedDemo implements Runnable{
    static SynchronizedDemo instance = new SynchronizedDemo();

    /**
     * 锁对象1
     */
    Object lock1 = new Object();

    /**
     * 锁对象2
     */
    Object lock2 = new Object();

    @Override
    public void run() {

        synchronized (lock1){
        System.out.println("我是lock1"+"正在执行"+Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我是lock1"+"结束执行"+Thread.currentThread().getName());
        }

        synchronized (lock2){
            System.out.println("我是lock2"+"正在执行"+Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("我是lock2"+"结束执行"+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(instance);
        Thread thread2 = new Thread(instance);
        thread1.start();
        thread2.start();
    }
}
