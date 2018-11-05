package com.ant.proxy.entity;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: User
 * @Description: TODO
 * @datetime 2018/11/5 8:20
 * @Version 1.0
 */
public class User {
    private String userName;
    private int age;
    private String desc;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
