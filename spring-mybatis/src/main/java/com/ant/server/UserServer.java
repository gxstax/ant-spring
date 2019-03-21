package com.ant.server;

import com.ant.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: UserServer
 * @Description: UserServer
 * @datetime 2019/3/21 9:07
 * @Version 1.0
 */

@Service
public class UserServer {

    @Resource
    private UserMapper userMapper;

    public void query() {
        System.out.println(userMapper.query());
    }
}
