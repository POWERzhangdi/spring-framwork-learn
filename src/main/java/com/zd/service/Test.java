package com.zd.service;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        LinkedList<Long> linkedList = new LinkedList();
        linkedList.add(123124L);
        linkedList.add(123125L);
        linkedList.add(123124L);
        linkedList.add(123125L);
        Set<Long> set = new HashSet<>();
        set.add(123124L);
        set.add(123125L);
        Map<Long,List<Long>> map = new HashMap<>();
        for(Long key : set){
            List<Long> list = new ArrayList<>();
            Iterator<Long> iterator = linkedList.iterator();
            while (iterator.hasNext()){
                Long num = iterator.next();
                if(num.longValue() == key.longValue()){
                    list.add(num);
                    iterator.remove();
                }
            }
            map.put(key,list);
        }
        System.out.println(map.toString());
    }
}
