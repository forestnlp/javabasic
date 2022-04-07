package com.generic;

import java.util.List;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/7 - 04 - 07 - 9:59
 * @Description: com.generic
 * @version: 1.0
 */
public class Test9 {

    static class A {

    }

    static class B extends A {

    }

    public void putA(List<A> lista ){

    }

    public void putB(List<B> listb) {
      //  putA(listb);
        System.out.println("自动进行类型转换，里氏替换");
    }


    public static void main(String[] args) {
    }
}
