package com.jackpan.thinking.in.spring.bean.definition;

import com.jackpan.thinking.in.spring.ioc.overview.domain.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * @author jackpan
 * @version v1.0 2021/2/7 23:08
 */
@Import(AnnotationBeanDefinitionDemo.Config.class)
public class AnnotationBeanDefinitionDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 注册Configuration Class
        applicationContext.register(AnnotationBeanDefinitionDemo.class);

        // 通过BeanDefinition 注册API实现
        registerUserBeanDefinition(applicationContext, "jack1-user");
        // 非命名的方式
        registerUserBeanDefinition(applicationContext);
        applicationContext.refresh();

        Map<String, Config> configBeans = applicationContext.getBeansOfType(Config.class);
        System.out.println("Config 类型的所有Beans:" + applicationContext.getBeansOfType(Config.class));
        System.out.println("User 类型的所有Beans:" + applicationContext.getBeansOfType(User.class));

        applicationContext.close();
    }

    public static void registerUserBeanDefinition(BeanDefinitionRegistry registry, String beanName) {
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(User.class);
        beanDefinitionBuilder.addPropertyValue("id", 1L)
                .addPropertyValue("name", "JackPan");

        if (StringUtils.hasText(beanName)) {
            registry.registerBeanDefinition(beanName, beanDefinitionBuilder.getBeanDefinition());
        } else {
            BeanDefinitionReaderUtils.registerWithGeneratedName(beanDefinitionBuilder.getBeanDefinition(), registry);
        }


    }

    public static void registerUserBeanDefinition(BeanDefinitionRegistry registry) {
        registerUserBeanDefinition(registry, null);
    }

    @Component
    public static class Config {
        @Bean(name = {"user", "jackpan-user"})
        public User user() {
            User user = new User();
            user.setId(1L);
            user.setName("JackPan");
            return user;
        }
    }


}
