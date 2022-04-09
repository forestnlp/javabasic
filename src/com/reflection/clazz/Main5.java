package com.reflection.clazz;

import java.lang.reflect.Field;

class Box{
    private final String color ="蓝色";
    private int len;
    private int width;
    private int height;
    private double weight;

    @Override
    public String toString() {
        return "Box{" +
                "color='" + color + '\'' +
                ", len=" + len +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

public class Main5 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Box box = Box.class.newInstance();
        Field field = Box.class.getDeclaredField("width");
        Field field2 = Box.class.getDeclaredField("color");
        field.setAccessible(true);
        field2.setAccessible(true);
        field.set(box,20);
        field2.set(box,"灰色");
        System.out.println(box);
    }
}
