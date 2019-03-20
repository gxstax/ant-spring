package com.ant.dao;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyFactoryBean
 * @Description MyFactoryBean
 * @Author Ant
 * @Date 2019-03-21 00:09
 * @Version 1.0
 **/

@Component("myFactoryBean")
public class MyFactoryBean implements FactoryBean {


    public void test(){
        System.out.println("myFactoryBean");
    }

    @Override
    public Object getObject() throws Exception {
        return new TempFactoryBean();
    }

    @Override
    public Class<?> getObjectType() {
        return TempFactoryBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
