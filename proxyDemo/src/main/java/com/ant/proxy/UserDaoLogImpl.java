package com.ant.proxy;

import com.ant.dao.UserDaoImpl;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: UserDaoLogImpl
 * @Description: TODO
 * @datetime 2018/11/5 8:42
 * @Version 1.0
 */
public class UserDaoLogImpl extends UserDaoImpl{
    @Override
    public void query() {
        System.out.println("----------------LOG-------------");
        super.query();
    }
}
