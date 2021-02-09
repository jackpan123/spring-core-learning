package com.jackpan.thinking.in.spring.bean.factory;

import com.jackpan.thinking.in.spring.ioc.overview.domain.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author jackpan
 * @version v1.0 2021/2/9 15:49
 */
public class UserFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        return User.createUser();
    }


    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
