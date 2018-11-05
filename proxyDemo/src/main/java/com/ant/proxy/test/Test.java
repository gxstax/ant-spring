package com.ant.proxy.test;

import com.ant.proxy.config.AppConfig;
import com.ant.proxy.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: Test
 * @Description: TODO
 * @datetime 2018/11/5 8:22
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acx  =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService service = acx.getBean(UserService.class);
        service.query();
    }
}
