package com.ant.dao.impl;

import com.ant.dao.UserDao;
import com.ant.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: UserDaoImpl
 * @Description: TODO
 * @datetime 2018/11/1 20:13
 * @Version 1.0
 */

@Repository
public class UserDaoImpl implements UserDao{

    @Override
    public List<User> query() {
        return null;
    }
}
