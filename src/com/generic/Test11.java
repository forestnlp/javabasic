package com.generic;

import java.util.List;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/7 - 04 - 07 - 9:59
 * @Description: com.generic
 * @version: 1.0
 */
public class Test11 {

    static class Point<T> {

    }

    public static void main(String[] args) {
        Point<? super Number> p1 = new Point<Object>();
        Point<? extends Number> p2 = new Point<Integer>();
    }
}
