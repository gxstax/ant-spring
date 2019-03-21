package com.ant.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyFactoryBean
 * @Description MyFactoryBean
 * @Author Ant
 * @Date 2019-03-21 00:09
 * @Version 1.0
 **/

/*
 * 如果你的类实现了FactoryBean
 * 那么spring容器中存在两个对象
 * 一个是getObjec()返回的对象
 * 还有一个是当前对象
 *
 * getObject 得到的对象存的是当前类指定的名字
 * 当前对象是 "&"+当前类的名字
 *
 *
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
