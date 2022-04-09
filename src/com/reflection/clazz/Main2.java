package com.reflection.clazz;

interface F1{

}

class C1 implements F1{

}

public class Main2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class F1Class = F1.class;
        F1 c = new C1();
        Class C1Class = c.getClass();
        Class<?> F1Class1 = Class.forName("com.reflection.clazz.F1");
        Class<?> C1lass11 = Class.forName("com.reflection.clazz.C1");
        System.out.println(F1Class == F1Class1);
        System.out.println(C1Class == C1lass11);
        System.out.println(F1Class == C1Class);
    }
}
