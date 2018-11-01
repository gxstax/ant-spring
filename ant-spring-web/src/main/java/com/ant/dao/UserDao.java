package com.ant.dao;

import com.ant.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: UserDao
 * @Description: TODO
 * @datetime 2018/11/1 20:10
 * @Version 1.0
 */
public interface UserDao {
    @Select("SELECT * FROM user")
    List<User> query();
}
