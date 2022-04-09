package com.reflection.clazz;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Main> mainClass = Main.class;
        Main m = new Main();
        Class aClass = m.getClass();
        Class<?> aClass1 = Class.forName("com.reflection.clazz.Main");
        System.out.println(mainClass == aClass);
        System.out.println(aClass == aClass1);
        // System.out.println(m.getClass().getClass());
    }
}
