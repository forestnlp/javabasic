package com.reflection.clazz;


import com.reflection.clazz.pojo.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main3 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // 获取类名称
        System.out.println(User.class.getName());
        System.out.println(User.class.getSimpleName());
        System.out.println(User.class.getCanonicalName());
        //获取接口信息
        System.out.println(" is interface ：" + User.class.isInterface());
        for (Class infs : User.class.getInterfaces()) {
            System.out.println(" impl interfaces :" + infs);
        }
        //父类
        System.out.println("Super class : " + User.class.getSuperclass());
        //获取属性
        for (Field field : User.class.getFields()) {
            System.out.println(" all field :" + field.getName());
        }
        //获取公开属性
        for (Field field : User.class.getDeclaredFields()) {
            System.out.println(" all DeclaredField :" + field.getName());
        }
        //获取公开方法
        for (Method declaredMethod : User.class.getDeclaredMethods()) {
            System.out.println(" all DeclaredMethods :" + declaredMethod.getName());
        }
        //获取公开方法
        for (Constructor constructor : User.class.getDeclaredConstructors()) {
            System.out.println(constructor.getName() + " 方法需要的参数如下：");
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println(constructor.getName() + "\t" + parameter.getType() + ":" + parameter.getName());
            }
        }
    }
}
