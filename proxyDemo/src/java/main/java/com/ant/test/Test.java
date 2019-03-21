package main.java.com.ant.test;

import com.ant.factorybean.IndexDao;
import com.ant.factorybean.IndexDaoImpl;
import com.ant.proxy.ProxyUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: Test
 * @Description: TODO
 * @datetime 2018/11/5 8:22
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
//        UserDaoImpl target = new UserDaoImpl();
//
//        UserDaoLog proxy = new UserDaoLog(target);
//
//        proxy.query();

//        UserDao factorybean = (UserDao) ProxyUtil.instance(new UserDaoImpl());
//        System.out.println(factorybean.querys("ant"));

        IndexDao dao = (IndexDao) ProxyUtil.instance(new IndexDaoImpl());
        dao.proxy();
    }
}
