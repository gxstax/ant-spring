package com.ant.test;

import java.lang.reflect.Method;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: TestClassLoader
 * @Description: TODO
 * @datetime 2018/11/23 17:36
 * @Version 1.0
 */
public class TestClassLoader {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.ant.test.A");
            Object obj = clazz.newInstance();
            Method method = clazz.getMethod("foo", String.class);

            method.invoke(obj, "ant");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
