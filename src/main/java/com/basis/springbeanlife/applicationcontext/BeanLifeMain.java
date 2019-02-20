package com.basis.springbeanlife.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 */

/*
 * ApplicationContext生命周期运行完成之后可以看出来
 * 容器实例化bean的时候先去加载自己的构造器 后加载自己的set方法都可以统称为设置属性
 * 之后如果实现了Aware接口就开始调用各个Aware接口的实现
 * 然后如果实现了InitializingBean 将回去调用它为bean谁知某些属性
 * 如果实现了了bean的处理器process会去调用它的前置实现
 * 之后才是自定义的init-method实现
 * 接下来就是beanProcess的后置处理了
 * 然后开始销毁容器调用destory()
 * 实现了destroy-method之后采取调用自定的销毁方法
 */

public class BeanLifeMain {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");
        MyPerson person1 = (MyPerson) context.getBean("person1");
        System.out.println(person1);
        ((ClassPathXmlApplicationContext) context).close();
    }

}
