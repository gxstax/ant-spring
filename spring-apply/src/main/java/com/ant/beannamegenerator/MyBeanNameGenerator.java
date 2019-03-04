package com.ant.beannamegenerator;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author Ant
 * @ClassName: MyBeanNameGenerator
 * @Description: 自定义bean的别名
 * @datetime 2018/11/18 16:25
 * @Version 1.0
 */
public class MyBeanNameGenerator extends AnnotationBeanNameGenerator {

    @Override
    protected String buildDefaultBeanName(BeanDefinition definition) {
        return "ant." + super.buildDefaultBeanName(definition);
    }
}
