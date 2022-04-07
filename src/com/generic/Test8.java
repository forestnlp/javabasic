package com.generic;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/7 - 04 - 07 - 9:59
 * @Description: com.generic
 * @version: 1.0
 */
public class Test8 {

    static class A {

    }

    static class B extends A {

    }

    public void putA(A a ){

    }

    public void putB(B b) {
        putA(b);
        System.out.println("自动进行类型转换，里氏替换");
    }


    public static void main(String[] args) {
        Test8 test8 = new Test8();
        test8.putB(new B());
    }
}
