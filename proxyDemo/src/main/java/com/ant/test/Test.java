package com.ant.test;

import com.ant.dao.UserDaoImpl;
import com.ant.proxy1.UserDaoLog;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: Test
 * @Description: TODO
 * @datetime 2018/11/5 8:22
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        UserDaoImpl target = new UserDaoImpl();

        UserDaoLog proxy = new UserDaoLog(target);

        proxy.query();

//        UserDaoImpl dao = new UserDaoLogImpl();
//        dao.query();
    }
}
