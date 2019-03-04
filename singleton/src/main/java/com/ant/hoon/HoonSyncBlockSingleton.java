package com.ant.hoon;

/**
 * @author Ant
 * @ClassName: HoonSingleton
 * @Description: 懒汉模式单例(同步代码块)
 * @datetime 2018/11/21 8:52
 * @Version 1.0
 */
public class HoonSyncBlockSingleton {
    private static HoonSyncBlockSingleton instance = null;

    private HoonSyncBlockSingleton() {

    }

    /**
     * 采用同步代码块的方式进行，没有解决线程安全问题；也可能同步两次
     * @return
     */
    private static HoonSyncBlockSingleton getInstance () {
        if (null == instance) {
            synchronized (HoonSyncBlockSingleton.class) {
                instance = new HoonSyncBlockSingleton();
            }

        }
        return  instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(HoonSyncBlockSingleton.getInstance());
            }).start();
        }
    }
}
