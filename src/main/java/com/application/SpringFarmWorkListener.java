package com.application;


import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.EventObject;

/**
 * springframwork 实现 application运行
 */
public class SpringFarmWorkListener {


    /**
     * 注解驱动
     * @param args
     */
    public static void main(String[] args) {
        //创建应用上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //添加监听事件 打印出监听到的时间
        context.addApplicationListener(event -> {
            System.out.println("监听到事件 : " + event);
        });
        //启动上下文(包含的运行)
        context.refresh();
        //发送自定义事件 必须在 上线问启动完成之后才能广播事件不然会报错 applicationEvent 是abstract抽象类实现了 eventObject对象
        context.publishEvent(new ApplicationEvent("applicationEvent对象事件") {
            @Override
            public Object getSource() {
                return "applicationEvent对象事件";
            }
        });
        context.publishEvent(new EventObject("EventObject对象事件"));
        //关闭上下文
        context.close();
    }
}
