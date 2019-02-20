package com.basis.springbeanlife.beanfactory;

import com.basis.springbeanlife.applicationcontext.MyBeanPostProcessor;
import com.basis.springbeanlife.applicationcontext.MyPerson;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


/*
    这个跟上面applicationcontex的处理形式差不多不多有些操作还是不一样的
    比如applicationContext的Aware接口他不能实现
    然后就是bean的process处理器必须手动注册
    之后就是beanFactory处理出来的bane并没有实例化在get的时候才具体实例化出来
 */
public class BeanFactoryLife {

    public static void main(String[] args) {
        ConfigurableBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
        beanFactory.addBeanPostProcessor(new MyBeanPostProcessor());
        MyPerson person1 = (MyPerson) beanFactory.getBean("person1");
        System.out.println(person1);
        beanFactory.destroySingletons();
    }

}
