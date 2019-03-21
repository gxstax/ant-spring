package com.ant;

import com.ant.conf.AppConfig;
import com.ant.factorybean.MyFactoryBean;
import com.ant.factorybean.TempFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Test
 * @Description Test
 * @Author Ant
 * @Date 2019-03-21 00:12
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        TempFactoryBean tempFactoryBean = (TempFactoryBean) applicationContext.getBean("myFactoryBean");

        tempFactoryBean.testFactoryBean();

        MyFactoryBean myFactoryBean = (MyFactoryBean) applicationContext.getBean("&myFactoryBean");
        myFactoryBean.test();
    }
}
