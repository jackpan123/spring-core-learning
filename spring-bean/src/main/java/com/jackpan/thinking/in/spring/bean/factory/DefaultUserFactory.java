package com.jackpan.thinking.in.spring.bean.factory;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

/**
 * @author jackpan
 * @version v1.0 2021/2/9 15:40
 */
public class DefaultUserFactory implements UserFactory, InitializingBean {

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
}
