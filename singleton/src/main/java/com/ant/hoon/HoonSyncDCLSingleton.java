package com.ant.hoon;

/**
 * @author Ant
 * @ClassName: HoonSingleton
 * @Description: 懒汉模式单例(DCL模式解决线程安全问题)
 * @datetime 2018/11/21 8:52
 * @Version 1.0
 */
public class HoonSyncDCLSingleton {
    private static HoonSyncDCLSingleton instance = null;

    private HoonSyncDCLSingleton() {

    }

    /**
     * 采用同步代码块的方式进行,
     * @return
     */
    private static HoonSyncDCLSingleton getInstance () {
        if (null == instance) {
            synchronized (HoonSyncDCLSingleton.class) {
                if(null == instance) {
                    instance = new HoonSyncDCLSingleton();
                }
            }
        }
        return  instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(HoonSyncDCLSingleton.getInstance());
            }).start();
        }
    }
}
