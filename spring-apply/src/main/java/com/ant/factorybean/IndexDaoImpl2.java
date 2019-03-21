package com.ant.factorybean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * @author Ant
 * @ClassName: IndexDaoImpl
 * @Description: IndexDaoImpl
 * @datetime 2018/11/18 14:03
 * @Version 1.0
 */
@Repository
@Profile("dao2")
public class IndexDaoImpl2 implements IndexDao {

    public IndexDaoImpl2(){
        System.out.println("Construct2");
    }

    @Override
    public void query() {
    }

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("IndexDaoImpl_2--这里可以在项目启动的时候加载配置文件信息");
    }
}
