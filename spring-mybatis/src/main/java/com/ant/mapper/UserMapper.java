package com.ant.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: UserMapper
 * @Description: UserMapper
 * @datetime 2019/3/21 9:00
 * @Version 1.0
 */
public interface UserMapper {

    @Select("select name from user where id = 1")
    String query();
}
