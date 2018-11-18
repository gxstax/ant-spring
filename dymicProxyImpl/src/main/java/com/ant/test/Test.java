package com.ant.test;

import com.ant.dao.IndexDao;
import com.ant.dao.IndexDaoImpl;
import com.ant.jdk.MyInvocationHandler;
import com.ant.jdk.MyInvocationHandlerImpl;
import com.ant.proxy.ProxyUtil;
import com.ant.service.UserService;
import org.spring.util.BeanFactory;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: Test
 * @Description: TODO
 * @datetime 2018/11/7 9:21
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws Exception {
//        IndexDao dao = (IndexDao) ProxyUtil.newInstance(IndexDao.class, new MyInvocationHandlerImpl());
//        dao.proxy();

//        IndexDao dao = (IndexDao) ProxyUtil.newInstance(IndexDao.class, new MyInvocationHandlerImpl());
//        dao.proxy();

        BeanFactory beanFactory = new BeanFactory("spring.xml");
        UserService service = (UserService) beanFactory.getBean("userService");
        service.query();
    }
}
