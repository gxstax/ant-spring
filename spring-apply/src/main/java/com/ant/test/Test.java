package com.ant.test;

import com.ant.config.AppConfig;
import com.ant.factorybean.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Ant
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
                = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.getEnvironment().setActiveProfiles("dao2");
        annotationConfigApplicationContext.register(AppConfig.class);
        annotationConfigApplicationContext.refresh();

        System.out.println(annotationConfigApplicationContext.getBean(IndexDao.class).getClass().getSimpleName());

//        IndexService service = (IndexService) annotationConfigApplicationContext.getBean("ant.indexService");
//        service.service();
    }
}
