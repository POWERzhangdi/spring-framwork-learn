package com.basis.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Profile("java8")
@Service
public class Java8CalculateService implements CalculateService {

    @Override
    public Integer sum(Integer... values) {
        System.out.println("java8的实现");
        int num = Stream.of(values).reduce(0, Integer::sum);
        return num;
    }
}
