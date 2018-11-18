package com.ant.config;

import com.ant.beannamegenerator.MyBeanNameGenerator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: AppConfig
 * @Description: TODO
 * @datetime 2018/11/18 14:41
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.ant", nameGenerator = MyBeanNameGenerator.class)
//@ImportResource("classpath:spring.xml")
public class AppConfig {

}
