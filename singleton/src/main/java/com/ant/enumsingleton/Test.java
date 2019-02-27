package com.ant.enumsingleton;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: Test
 * @Description: TODO
 * @datetime 2018/11/23 16:42
 * @Version 1.0
 */
public class Test {


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
//            System.out.println(EnumHolder.values()[0].getInstance().hashCode());
            System.out.println(EnumHolder.getStudent().getName());
        }
//        byte[] bytes= new byte[8];
//        for (int i = 0; i < bytes.length; i++){
//            bytes[i] = (byte)(Math.random() * 100);
//        }
//        for(byte b : bytes) {
//            System.out.println(String.format("%X", b));
//        }
    }
}
