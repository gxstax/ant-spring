package com.ant.hungery;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: HungerySingleton
 * @Description: 饿汉模式单例
 * @datetime 2018/11/21 8:27
 * @Version 1.0
 */
public class HungerySingleton {
    private static HungerySingleton instance = new HungerySingleton();

    private HungerySingleton () {

    }

    public static HungerySingleton getInstance() {
        return instance;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(HungerySingleton.getInstance());
            }).start();
        }
    }
}
