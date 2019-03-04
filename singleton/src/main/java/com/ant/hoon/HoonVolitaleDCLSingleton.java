package com.ant.hoon;

/**
 * @author Ant
 * @ClassName: HoonSingleton
 * @Description: 懒汉模式单例(volatile + DCL模式解决线程安全问题)
 * @datetime 2018/11/21 8:52
 * @Version 1.0
 */
public class HoonVolitaleDCLSingleton {

    private String tt;

    private String ss;

    private volatile static HoonVolitaleDCLSingleton instance = null;

    private HoonVolitaleDCLSingleton() {
        //如果instance不加volatile,则在指令重拍的的过程中，instanse如果放到前面，则有可能造成调用tt或
        //ss的时候造成空指针异常
        tt = "tt";
        ss = "";
        instance = new HoonVolitaleDCLSingleton();
    }

    /**
     * 采用同步代码块的方式进行,
     * @return
     */
    private static HoonVolitaleDCLSingleton getInstance () {
        if (null == instance) {
            synchronized (HoonVolitaleDCLSingleton.class) {
                if(null == instance) {
                    instance = new HoonVolitaleDCLSingleton();
                }
            }
        }
        return  instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(HoonVolitaleDCLSingleton.getInstance());
            }).start();
        }
    }
}
