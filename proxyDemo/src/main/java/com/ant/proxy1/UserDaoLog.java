package com.ant.proxy1;

import com.ant.dao.UserDao;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: UserDaoLog
 * @Description: TODO
 * @datetime 2018/11/5 8:53
 * @Version 1.0
 */
public class UserDaoLog implements UserDao {
    private UserDao dao;

    public UserDaoLog (UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void query() {
        System.out.println("----------------- LOG --------------");
        dao.query();
    }

    @Override
    public void query(String str) {

    }
}
