package com.ant;

import com.ant.conf.AppConfig;
import com.ant.server.UserServer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: Test
 * @Description: Test
 * @datetime 2019/3/21 9:04
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserServer bean = annotationConfigApplicationContext.getBean(UserServer.class);

        bean.query();
    }
}

