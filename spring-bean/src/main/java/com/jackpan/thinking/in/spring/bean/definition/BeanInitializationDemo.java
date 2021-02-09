package com.jackpan.thinking.in.spring.bean.definition;

import com.jackpan.thinking.in.spring.bean.factory.DefaultUserFactory;
import com.jackpan.thinking.in.spring.bean.factory.UserFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

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
        System.out.println("Spring上下文启动完成....");

        UserFactory userFactory = applicationContext.getBean(UserFactory.class);
        System.out.println("Spring上下文正在关闭中....");
        applicationContext.close();
    }

    @Bean(initMethod = "initUserFactory", destroyMethod = "doDestroy")
    @Lazy
    public UserFactory userFactory() {
        return new DefaultUserFactory();
    }


}
