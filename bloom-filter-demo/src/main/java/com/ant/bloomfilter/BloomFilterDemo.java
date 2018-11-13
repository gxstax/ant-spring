package com.ant.bloomfilter;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnel;
import com.google.common.hash.Funnels;

import java.nio.charset.Charset;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: BloomFilterDemo
 * @Description: TODO
 * @datetime 2018/11/8 19:00
 * @Version 1.0
 */
public class BloomFilterDemo {

    private static final int size = 1000000;

    private static BloomFilter<String> bloomFilter = BloomFilter.create(Funnels.stringFunnel(Charset.defaultCharset()), size);

    public static void main(String[] args) {

        for (int i = 0; i < size; i++) {
            bloomFilter.put("mayi"+i);
        }

        long startTime = System.nanoTime();
        if(bloomFilter.mightContain("mayi900")) {
            System.out.println("命中");
        }
        long endTime = System.nanoTime();

        System.out.println("命中用时" + (double)(endTime - startTime)/1000000L + "ms");
    }
}
