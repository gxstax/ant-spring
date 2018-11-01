package com.ant.service;

import com.ant.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: UserService
 * @Description: TODO
 * @datetime 2018/11/1 20:15
 * @Version 1.0
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void queryUser() {
        System.out.println(userDao.query());
    }
}
