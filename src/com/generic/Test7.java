package com.generic;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/7 - 04 - 07 - 9:59
 * @Description: com.generic
 * @version: 1.0
 */
public class Test7 {
    public static <T> T getInstance(Class<T> c) {
        T t = null;
        try {
            t = c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return t;
    }
    public static void main(String[] args) throws ClassNotFoundException {
        Object instance = Test7.getInstance(Class.forName("com.generic.O"));
        System.out.println(instance.getClass());
    }
}
