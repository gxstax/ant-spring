package com.ant.dao;

import org.springframework.stereotype.Component;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: IndexDaoImpl
 * @Description: TODO
 * @datetime 2018/11/18 14:03
 * @Version 1.0
 */
@Component("dao")
public class IndexDaoImpl implements IndexDao{

    private String str;


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public void query(String strs) {
        System.out.println(str);
        System.out.println(strs);
    }

}
