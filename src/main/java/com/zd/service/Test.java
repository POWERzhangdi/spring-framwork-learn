package com.zd.service;

import java.util.*;

public class Test {

    public static void main(String[] args) {
//        LinkedList<Long> linkedList = new LinkedList();
//        linkedList.add(123124L);
//        linkedList.add(123125L);
//        linkedList.add(123124L);
//        linkedList.add(123125L);
//        Set<Long> set = new HashSet<>();
//        set.add(123124L);
//        set.add(123125L);
//        Map<Long,List<Long>> map = new HashMap<>();
//        for(Long key : set){
//            List<Long> list = new ArrayList<>();
//            Iterator<Long> iterator = linkedList.iterator();
//            while (iterator.hasNext()){
//                Long num = iterator.next();
//                if(num.longValue() == key.longValue()){
//                    list.add(num);
//                    iterator.remove();
//                }
//            }
//            map.put(key,list);
//        }
//        System.out.println(map.toString());


        /**
         * 这两种运算结果不一样
         * 本质原因还不是很清楚
         * 目前的理解是：j作为一个变量存储的变量区 jvm编译器 编译完成之后变成的class文件进行了一次调优
         * 变成了 ++j
         *
         * 第二种 在 class 文件变成了  i = a + 1; a = a;
         *
         * a 存放在 堆栈
         *
         * 很晦涩
         *
         */
        int j =0;
        for (int i =0 ;i<100;i++){
            j++;
        }
        System.out.println(j);

        int a =0;
        for (int i =0 ;i<100;i++){
            a = a++;
        }
        System.out.println(a);
    }
}
