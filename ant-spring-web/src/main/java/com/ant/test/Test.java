package com.ant.test;

import com.ant.config.AppConfig;
import com.ant.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: Test
 * @Description: TODO
 * @datetime 2018/11/1 20:17
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acx =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService service = (UserService) acx.getBean("userService");
        service.queryUser();
    }
}
