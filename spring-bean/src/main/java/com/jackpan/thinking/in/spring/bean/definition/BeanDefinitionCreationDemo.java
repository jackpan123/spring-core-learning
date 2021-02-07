package com.jackpan.thinking.in.spring.bean.definition;

import com.jackpan.thinking.in.spring.ioc.overview.domain.User;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @author jackpan
 * @version v1.0 2021/2/7 22:25
 */
public class BeanDefinitionCreationDemo {

    public static void main(String[] args) {
        // 通过BeanDefinitionBuilder
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(User.class);
        beanDefinitionBuilder.addPropertyValue("id", 1)
                .addPropertyValue("name", "JackPan");
        BeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();


        // 通过AbstractBeanDefinition 派生类
        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClass(User.class);
        MutablePropertyValues propertyValues= new MutablePropertyValues();
        propertyValues.add("id", 1)
                .add("name", "JackPan");
        genericBeanDefinition.setPropertyValues(propertyValues);


    }
}
