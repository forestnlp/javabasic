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
public class Test14 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(42);
        l1.getClass().getMethod("add",Object.class).invoke(l1,"abc");
        System.out.println(l1);
    }
}
