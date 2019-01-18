package com.basis.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * synchronized 修饰的同步代码块 出现异常了 会释放掉锁
 * method2()是原理实现代码 example
 *
 */
public class SynchronizedParsDemo {

    Lock lock = new ReentrantLock();

    public synchronized void method1(){
        System.out.println("synchronized修饰");
    }


    public void method2(){
        lock.lock();
        try {
            System.out.println("lock做法");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        SynchronizedParsDemo demo = new SynchronizedParsDemo();
        demo.method1();
        demo.method2();
    }

}
