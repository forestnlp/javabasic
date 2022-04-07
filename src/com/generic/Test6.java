package com.generic;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/7 - 04 - 07 - 9:59
 * @Description: com.generic
 * @version: 1.0
 */
public class Test6 {
    public static <T,V> void print(T[] arr,V[] arr2) {
        for(T t:arr) {
            System.out.print(t+"\t");
        }
        for(V v:arr2) {
            System.out.print(v+"\t");
        }
    }
    public static void main(String[] args) {
        Test6.print(new String[]{"a","b","c"},new Integer[]{1,2,3,4,5});
    }
}
