package com.jackpan.thinking.in.spring.bean.factory;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author jackpan
 * @version v1.0 2021/2/9 15:40
 */
public class DefaultUserFactory implements UserFactory, InitializingBean, DisposableBean {

    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct: UserFactory初始化中...");
    }

    public void initUserFactory() {
        System.out.println("自定义方法: initUserFactory UserFactory初始化中...");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean#afterPropertiesSet方法: UserFactory初始化中...");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("@PreDestroy: UserFactory销毁中...");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean#destroy(): UserFactory销毁中...");
    }

    public void doDestroy() {
        System.out.println("自定义方法: UserFactory销毁中...");
    }
}
