package com.ant.dao;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: UserDaoImpl
 * @Description: TODO
 * @datetime 2018/11/5 8:31
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao{

    @Override
    public void query () {
        System.out.println("假装查询数据库");
    }

    @Override
    public void query(String str) {
        System.out.println(str);
    }

    @Override
    public String querys(String str) {
        return "this is returnStr";
    }

}
