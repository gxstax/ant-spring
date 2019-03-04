package com.ant.service;

import com.ant.dao.IndexDao;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Ant
 * @ClassName: IndexService
 * @Description: TODO
 * @datetime 2018/11/18 14:04
 * @Version 1.0
 */
//@Service
public class IndexService {

//    @Autowired
//    private IndexDao dao;

    @Autowired
    private TestService testService;

//    @Lookup
//    public abstract IndexDao getDao();

//    public IndexService (IndexDao ant) {
//        this.dao = ant;
//    }

    public void service()
    {
        System.out.println("service--  " + this.hashCode());
//        System.out.println("dao--- " + getDao().hashCode());
    }

//    public void setAnt(IndexDao dao) {
//        this.dao = dao;
//    }
}
