package com.jackpan.thinking.in.spring.io.overview.dependency.lookup;

import com.jackpan.thinking.in.spring.io.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jackpan
 * @version v1.0 2021/2/2 10:04
 */
public class DependencyLookupDemo {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("META-INF/dependency-lookup-context.xml");
        User user = (User)beanFactory.getBean("user");
        System.out.println(user.toString());
    }
}
