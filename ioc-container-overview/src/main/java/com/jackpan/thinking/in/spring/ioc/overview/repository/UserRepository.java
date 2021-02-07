package com.jackpan.thinking.in.spring.ioc.overview.repository;

import com.jackpan.thinking.in.spring.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;

import java.util.Collection;

/**
 * @author jackpan
 * @version v1.0 2021/2/2 14:32
 */
public class UserRepository {

    private Collection<User> users;

    private BeanFactory beanFactory;

    private ObjectFactory<ApplicationContext> objectFactory;

    /**
     * Gets users.
     *
     * @return Value of users.
     */
    public Collection<User> getUsers() {
        return this.users;
    }

    /**
     * Sets users.
     *
     * @param users Simple param.
     */
    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    /**
     * Gets beanFactory.
     *
     * @return Value of beanFactory.
     */
    public BeanFactory getBeanFactory() {
        return this.beanFactory;
    }

    /**
     * Sets beanFactory.
     *
     * @param beanFactory Simple param.
     */
    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    /**
     * Gets objectFactory.
     *
     * @return Value of objectFactory.
     */
    public ObjectFactory<ApplicationContext> getObjectFactory() {
        return this.objectFactory;
    }

    /**
     * Sets objectFactory.
     *
     * @param objectFactory Simple param.
     */
    public void setObjectFactory(ObjectFactory<ApplicationContext> objectFactory) {
        this.objectFactory = objectFactory;
    }
}
