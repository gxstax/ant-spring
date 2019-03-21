package com.ant.test;

import com.ant.service.UserService;
import org.spring.util.BeanFactory;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: Test
 * @Description: TODO
 * @datetime 2018/11/7 9:21
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws Exception {
//        IndexDao factorybean = (IndexDao) ProxyUtil.newInstance(IndexDao.class, new MyInvocationHandlerImpl());
//        factorybean.proxy();

//        IndexDao factorybean = (IndexDao) ProxyUtil.newInstance(IndexDao.class, new MyInvocationHandlerImpl());
//        factorybean.proxy();

        BeanFactory beanFactory = new BeanFactory("spring.xml");
        UserService service = (UserService) beanFactory.getBean("userService");
        service.query();
    }
}
