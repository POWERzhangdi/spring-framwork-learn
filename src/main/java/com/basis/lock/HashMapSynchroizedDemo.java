package com.basis.lock;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSynchroizedDemo {
    static Map<Integer,Integer> map = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        HashMapSynchroizedDemo synchroizedDemo = new HashMapSynchroizedDemo();
        HashMapSynchroizedDemo.Runable1 runable1 = synchroizedDemo.new Runable1();
        Thread thread1 = new Thread(runable1);
        Thread thread2 = new Thread(runable1);
        thread1.start();
        thread2.start();
    }

    class Runable1 implements Runnable{

        @Override
        public void run() {
            for(int i = 0 ;i< 5;i++){
                System.out.println("当前线程"+Thread.currentThread().getName()+"正在操作map");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                map.put(i,i);
            }
            System.out.println(map.toString());
            System.out.println("执行完成之后map的大小:"+map.size());

        }
    }




}
