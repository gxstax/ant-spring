package com.ant.innerclass;

/**
 * @author Ant gxstax@163.com
 * @ClassName: HolderSingleton
 * @Description: 静态内部类实现单例
 * @datetime 2018/11/23 14:11
 * @Version 1.0
 */
public class HolderSingleton {

    /**
     * 内部静态类
     */
    public static class Holder {
        private static final HolderSingleton instance = new HolderSingleton();
    }

    /**
     * 写一个public的静态方法，供外部调用
     * @return
     */
    public static HolderSingleton getInstance () {
        return Holder.instance;
    }

    public static void main(String[] args) {
        System.out.println(HolderSingleton.getInstance());
    }
}
