package com.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/7 - 04 - 07 - 9:59
 * @Description: com.generic
 * @version: 1.0
 */
public class Test19<T> {

   // private static T t;

    public static <T> void printT(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        Test19.<String>printT("abc");
    }
}
