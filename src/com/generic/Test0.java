package com.generic;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/7 - 04 - 07 - 9:02
 * @Description: com.generic
 * @version: 1.0
 */
public class Test0 {
    public static <T extends Number> double add(T a,T b) {
        return a.doubleValue()+b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(Test0.add(1.0f,2l));
    }
}
