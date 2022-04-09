package com.reflection.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;

interface Fly{
   void fly();
}

class Animal {
    public void live() {
        System.out.println(" living ");
    }
}

class Bird  extends Animal implements Fly{
    @Override
    public void fly() {
        System.out.println("flying");
    }

    public static void eat(String food){
        System.out.println("eating some "+food);
    }

    private int layeggs(int num) {
        System.out.println(" lay "+ num+ " eggs , hope born baby birds");
        return new Random().nextInt(num);
    }
}

public class Main6 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Bird bird = Bird.class.newInstance();
        Method[] methods = Bird.class.getDeclaredMethods();
        for(Method method:methods){
            System.out.println("Bird类有这个方法:"+method.getName()+",其参数个数:"+method.getParameterCount());
        }
        //调用一个私有方法试试
        Method method = Bird.class.getDeclaredMethod("layeggs", int.class);
        method.setAccessible(true);
        Integer ret = (Integer) method.invoke(bird, 42);
        System.out.println(ret);

        //调用一个静态方法
        Method staticmethod = Bird.class.getDeclaredMethod("eat",String.class);
        staticmethod.invoke(null,"谷子");
    }
}
