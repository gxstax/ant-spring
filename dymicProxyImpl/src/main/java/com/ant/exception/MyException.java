package com.ant.exception;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: MyException
 * @Description: 自定义异常
 * @datetime 2018/11/14 8:14
 * @Version 1.0
 */
public class MyException extends RuntimeException{

    public MyException(String msg) {
        super(msg);
    }
}
