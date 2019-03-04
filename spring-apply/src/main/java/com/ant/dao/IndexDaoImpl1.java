package com.ant.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * @author Ant
 * @ClassName: IndexDaoImpl
 * @Description: TODO
 * @datetime 2018/11/18 14:03
 * @Version 1.0
 */
@Repository
@Profile("dao1")
public class IndexDaoImpl1 implements IndexDao {

    public IndexDaoImpl1(){
        System.out.println("Construct1");
    }

    @Override
    public void query() {
    }

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("IndexDaoImpl_1---这里可以在项目启动的时候加载配置文件信息");
    }
}
