package com.ant.test;

import com.ant.config.AppConfig;
import com.ant.dao.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.ws.Service;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: Test
 * @Description: TODO
 * @datetime 2018/11/18 14:05
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext classPathXmlApplicationContext
//                = new ClassPathXmlApplicationContext("classpath:spring.xml");
//        IndexService service = (IndexService) classPathXmlApplicationContext.getBean(IndexService.class);
//        service.service();
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(AppConfig.class);

//        IndexService service = (IndexService) annotationConfigApplicationContext.getBean("ant.indexService");
//        service.service();
    }
}
