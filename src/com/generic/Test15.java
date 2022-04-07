package com.generic;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/7 - 04 - 07 - 9:59
 * @Description: com.generic
 * @version: 1.0
 */
public class Test15 {

    public static void main(String[] args) {
        Test15.print(1);
        Test15.print(new Object());
        //Test15.<Integer>print("abc");
    }

    public static <T> void print(T t) {
        System.out.println(t);
    }
}
