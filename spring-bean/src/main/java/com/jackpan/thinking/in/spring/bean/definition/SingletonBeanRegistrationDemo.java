package com.jackpan.thinking.in.spring.bean.definition;

import com.jackpan.thinking.in.spring.bean.factory.DefaultUserFactory;
import com.jackpan.thinking.in.spring.bean.factory.UserFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jackpan
 * @version v1.0 2021/2/9 23:51
 */
public class SingletonBeanRegistrationDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        UserFactory userFactory = new DefaultUserFactory();
        ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();
        beanFactory.registerSingleton("userFactory", userFactory);
        applicationContext.refresh();

        UserFactory userFactoryLookupBean = beanFactory.getBean("userFactory", UserFactory.class);
        System.out.println(userFactory == userFactoryLookupBean);
        applicationContext.close();
    }
}
