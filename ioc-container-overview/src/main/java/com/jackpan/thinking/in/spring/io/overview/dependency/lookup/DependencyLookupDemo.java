package com.jackpan.thinking.in.spring.io.overview.dependency.lookup;

import com.jackpan.thinking.in.spring.io.overview.annotation.Super;
import com.jackpan.thinking.in.spring.io.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author jackpan
 * @version v1.0 2021/2/2 10:04
 */
public class DependencyLookupDemo {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("META-INF/dependency-lookup-context.xml");
//        lookupRealTime(beanFactory);
//        lookupInLazy(beanFactory);
        lookupByType(beanFactory);
        lookupCollectionByType(beanFactory);
        lookupByAnnotationType(beanFactory);
    }

    private static void lookupByAnnotationType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> users = (Map)listableBeanFactory.getBeansWithAnnotation(Super.class);
            System.out.println("查找到@Super的所有集合对象：" + users);
        }
    }

    private static void lookupCollectionByType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> users = listableBeanFactory.getBeansOfType(User.class);
            System.out.println("查找到的所有集合对象：" + users);
        }
    }

    private static void lookupByType(BeanFactory beanFactory) {
        User user = beanFactory.getBean(User.class);
        System.out.println("实时查找" + user.toString());
    }

    private static void lookupInLazy(BeanFactory beanFactory) {
        ObjectFactory<User> objectFactory = (ObjectFactory<User>) beanFactory.getBean("objectFactory");
        User user = objectFactory.getObject();
        System.out.println("延迟查找" + user.toString());
    }

    private static void lookupRealTime(BeanFactory beanFactory) {
        User user = (User)beanFactory.getBean("user");
        System.out.println("实时查找" + user.toString());
    }
}
