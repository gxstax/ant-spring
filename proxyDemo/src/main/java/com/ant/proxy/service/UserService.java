package com.ant.proxy.service;

import com.ant.proxy.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: UserService
 * @Description: TODO
 * @datetime 2018/11/5 8:17
 * @Version 1.0
 */
@Service
public class UserService {

    @Autowired
    private UserDao dao;


    public void query() {
        System.out.println(dao.query());
    }
}
