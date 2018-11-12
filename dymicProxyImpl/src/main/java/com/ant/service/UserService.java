package com.ant.service;

import com.ant.dao.UserDao;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: UserService
 * @Description: TODO
 * @datetime 2018/11/12 8:37
 * @Version 1.0
 */
public class UserService {
    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public UserDao dao;

    public void query() {
        dao.query();
    }
}
