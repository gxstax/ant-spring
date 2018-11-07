package com.ant.jdk;

import java.lang.reflect.Method;

/**
 * @author gaoxx gxx@fxiaoke.com
 * @ClassName: MyInvocationHandler
 * @Description: 模拟jdk自己手写InvocationHandler接口
 * @datetime 2018/11/7 9:03
 * @Version 1.0
 */
public interface MyInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args);
}
