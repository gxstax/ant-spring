package com.ant.hoon;

/**
 * @author Ant
 * @ClassName: HoonSingleton
 * @Description: 懒汉模式单例(同步方法)
 * @datetime 2018/11/21 8:52
 * @Version 1.0
 */
public class HoonSyncSingleton {
    private static HoonSyncSingleton instance = null;

    private HoonSyncSingleton() {

    }

    /**
     * 采用同步方法的模式来保证线程安全，缺点：线程是串行，性能低
     * @return
     */
    private synchronized static HoonSyncSingleton getInstance () {
        if (null == instance) {
            instance = new HoonSyncSingleton();
        }
        return  instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(HoonSyncSingleton.getInstance());
            }).start();
        }
    }
}
