package com.zd.lock;


/**
 * 类锁
 * 1.static 方法
 * 2.xxx.class 形式
 *
 * static 关键字 它是不存在作用于 this的  而且 它不需要实例来调用 对象的属性和方法
 * 通过 class就可以 所以 这里存在  static 这种形式的类锁
 * 不够 static的加载顺序会影响 线程的执行顺序
 * 你可以把  method1() or  method2() 写到  main()方法之下 就变成了 thread1 先执行
 */
public class SynchronizedClassDemo implements Runnable {

    static SynchronizedClassDemo instance1 = new SynchronizedClassDemo();
    static SynchronizedClassDemo instance2 = new SynchronizedClassDemo();

    public static synchronized void method1() {
        System.out.println("我是" + Thread.currentThread().getName() + "正在执行");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "执行完成");
    }

    public void method2() {
        synchronized (SynchronizedClassDemo.class) {
            System.out.println("我是" + Thread.currentThread().getName() + "正在执行");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "执行完成");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(instance1);
        Thread thread2 = new Thread(instance2);
        thread1.start();
        thread2.start();
        while (thread1.isAlive() || thread2.isAlive()) {

        }
        System.out.println("finish");
    }


    @Override
    public void run() {
        //method1();
        method2();
    }





}
