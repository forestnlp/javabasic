package com.reflection.clazz;


import com.reflection.clazz.pojo.User;

import java.lang.reflect.*;

class Apple{
    private String color;
    private String area;
    private double weight;
    private double price;

    public Apple() {
    }

    public Apple(String color, String area) {
        this.color = color;
        this.area = area;
    }

    public Apple(String color, String area, double weight, double price) {
        this.color = color;
        this.area = area;
        this.weight = weight;
        this.price = price;
    }

    private Apple(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", area='" + area + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}

public class Main4 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //使用默认构造方法
        Apple apple = Apple.class.newInstance();
        System.out.println(apple);
        //使用Apple(String color, String area)来构造
        Constructor<Apple> constructor = Apple.class.getConstructor(String.class, String.class);
        Apple apple1 = constructor.newInstance("红色", "阿克苏");
        System.out.println(apple1);
        //调用私有构造方法  private Apple(String area)
        Constructor<Apple> constructor1 = Apple.class.getDeclaredConstructor(String.class);
        constructor1.setAccessible(true);
        Apple apple2 = constructor1.newInstance("山东");
        System.out.println(apple2);
    }
}
