package main.java.com.ant.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: MyInvocationHandler
 * @Description: 自己写一个InvocationHandler
 * @datetime 2018/11/6 19:37
 * @Version 1.0
 */
public class MyInvocationHandler<T> implements InvocationHandler{
    T target;
    public MyInvocationHandler(T target) {
        this.target = target;
    }

    /**
     *
     * @param proxy 代理对象
     * @param method 代理目标对象
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(target, args);
        return result;
    }
}
