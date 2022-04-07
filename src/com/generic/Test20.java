package com.generic;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/7 - 04 - 07 - 13:00
 * @Description: com.generic
 * @version: 1.0
 */
public class Test20<T> {

    public static void main(String[] args) {
        Test20<Integer> genericType = new Test20<Integer>() {
        };
        Type superclass = genericType.getClass().getGenericSuperclass();
        Type type = ((ParameterizedType) superclass).getActualTypeArguments()[0];
        System.out.println(type);//class java.lang.String
    }
}
