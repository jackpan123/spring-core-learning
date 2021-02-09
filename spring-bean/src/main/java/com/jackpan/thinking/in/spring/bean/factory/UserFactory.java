package com.jackpan.thinking.in.spring.bean.factory;

import com.jackpan.thinking.in.spring.ioc.overview.domain.User;

/**
 * @author jackpan
 * @version v1.0 2021/2/9 15:39
 */
public interface UserFactory {

    default User createUser() {
        return User.createUser();
    }
}
