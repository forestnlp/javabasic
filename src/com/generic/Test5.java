package com.generic;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/7 - 04 - 07 - 9:59
 * @Description: com.generic
 * @version: 1.0
 */
public class Test5 {
    public static <T> void print(T[] arr) {
        for(T t:arr) {
            System.out.print(t+"\t");
        }
    }
    public static void main(String[] args) {
        Test5.print(new String[]{"a","b","c"});
    }
}
