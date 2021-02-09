package com.jackpan.thinking.in.spring.bean.definition;

import com.jackpan.thinking.in.spring.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jackpan
 * @version v1.0 2021/2/9 15:22
 */
public class BeanInstantiationDemo {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/bean-instantiation-context.xml");
        User user = beanFactory.getBean("user-by-static-method", User.class);
        User userByInstanceMethod = beanFactory.getBean("user-by-instance-method", User.class);
        User userByFactoryMethod = beanFactory.getBean("user-by-factory-method", User.class);
        System.out.println(user);
        System.out.println(userByInstanceMethod);
        System.out.println(userByFactoryMethod);
        System.out.println(user == userByInstanceMethod);
        System.out.println(user == userByFactoryMethod);
    }
}
