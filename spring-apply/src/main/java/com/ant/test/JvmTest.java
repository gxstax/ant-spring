package com.ant.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ant
 * @ClassName: JvmTest
 * @Description: TODO
 * @datetime 2019/2/27 9:28
 * @Version 1.0
 */
public class JvmTest {

    private byte[] bytes = new byte[1024 * 50];



    public static void main(String[] args) {

        List<JvmTest> objLst = new ArrayList<>();
        for (int i = 0; i < 20000; i++) {
            try {
                Thread.sleep(5L);
                objLst.add(new JvmTest());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
