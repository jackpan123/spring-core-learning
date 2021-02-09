package com.jackpan.thinking.in.spring.bean.definition;

import com.jackpan.thinking.in.spring.bean.factory.DefaultUserFactory;
import com.jackpan.thinking.in.spring.bean.factory.UserFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author jackpan
 * @version v1.0 2021/2/9 15:22
 */
@Configuration
public class BeanInitializationDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 注册Configuration Class
        applicationContext.register(BeanInitializationDemo.class);
        applicationContext.refresh();

        UserFactory userFactory = applicationContext.getBean(UserFactory.class);
        applicationContext.close();
    }

    @Bean(initMethod = "initUserFactory")
    public UserFactory userFactory() {
        return new DefaultUserFactory();
    }


}
