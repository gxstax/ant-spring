package com.ant.hoon;

/**
 * @author Ant
 * @ClassName: HoonSingleton
 * @Description: 懒汉模式单例
 * @datetime 2018/11/21 8:52
 * @Version 1.0
 */
public class HoonSingleton {
    private static HoonSingleton instance = null;

    public HoonSingleton() {

    }

    private static HoonSingleton getInstance () throws InterruptedException {
        Thread.sleep(100L);
        if (null == instance) {
            instance = new HoonSingleton();
        }
        return  instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                try {
                    System.out.println(HoonSingleton.getInstance());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
