package com.basis.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("java7")
@Service
public class Java7CalculateService implements CalculateService{

    @Override
    public Integer sum(Integer... values) {
        System.out.println("java7的实现");
        int num = 0;
        for (int i = 0; i < values.length; i++) {
            num += values[i];
        }
        return num;
    }
}
