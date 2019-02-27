package com.ant.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: IndexDaoImpl
 * @Description: TODO
 * @datetime 2018/11/18 14:03
 * @Version 1.0
 */
@Repository
public class IndexDaoImpl implements IndexDao {

    public IndexDaoImpl(){
        System.out.println("Construct");
    }

    @Override
    public void query() {
    }

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("这里可以在项目启动的时候加载配置文件信息");
    }
}
