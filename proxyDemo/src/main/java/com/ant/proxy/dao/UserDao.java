package com.ant.proxy.dao;

import com.ant.proxy.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author gaoxx gxx@fxiaoke.com
 * @ClassName: UserDao
 * @Description: TODO
 * @datetime 2018/11/5 8:17
 * @Version 1.0
 */
public interface UserDao {

    @Select("select * from user")
    public List<User> query();
}
