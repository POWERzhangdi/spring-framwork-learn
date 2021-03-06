package com.basis.springbeanlife.applicationcontext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class MyPerson implements BeanNameAware, BeanFactoryAware, ApplicationContextAware
        , InitializingBean, DisposableBean {

    private String name;

    public MyPerson() {
        System.out.println("自定义MyPerson的构造器");
    }

    public void setName(String name){
        this.name = name;
        System.out.println("自定义MyPerson的set()方法被调用");
    }

    public void myInit(){
        System.out.println("自定义MyPerson的myInit()方法被调用");
    }

    public void myDestroy(){
        System.out.println("自定义MyPerson的myDestroy()方法被调用");
    }
    public void destroy() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("destory被调用");
    }

    public void afterPropertiesSet() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("afterPropertiesSet被调用");
    }

    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        // TODO Auto-generated method stub
        System.out.println("setApplicationContext被调用");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        // TODO Auto-generated method stub
        System.out.println("setBeanFactory被调用,beanFactory");
    }

    public void setBeanName(String beanName) {
        // TODO Auto-generated method stub
        System.out.println("setBeanName被调用,beanName:" + beanName);
    }

    public String toString() {
        return "name is :" + name;
    }

}
