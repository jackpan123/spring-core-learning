package com.jackpan.thinking.in.spring.bean.definition;

import com.jackpan.thinking.in.spring.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jackpan
 * @version v1.0 2021/2/7 23:00
 */
public class BeanAliasDemo {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/bean-definitions-context.xml");
        User jackUser = beanFactory.getBean("jack-user", User.class);
        User user = beanFactory.getBean("user", User.class);
        System.out.println("jack-user  是否与 user bean相同:" + (user == jackUser));
    }
}
