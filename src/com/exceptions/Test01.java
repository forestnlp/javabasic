package com.exceptions;

import com.sun.xml.internal.ws.api.model.CheckedException;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/8 - 04 - 08 - 12:23
 * @Description: com.exceptions
 * @version: 1.0
 */
public class Test01 {

    static int m1(){
        try{
            int a =1/0;
            return 1;
        }
        catch (Exception e) {
            return 2;
        }
    }

    static int m2(){
        try{
            int a =1/0;
            return 1;
        }
        catch (Exception e){
            return 2;
        }
        finally {
            return 3;
        }
    }

    static int m3(){
        try{
            return 1;
        }
        finally {
            return 2;
        }
    }

    static int m4(){
        int result = 0;
        try{
            return result;
        }
        finally {
            result = 1;
        }
    }

    static StringBuilder m5(){
        StringBuilder result = new StringBuilder("ab");
        try{
            return result;
        }
        finally {
            result.append("aaaa");
        }
    }

    static StringBuilder m6(){
        StringBuilder result = new StringBuilder("ab");
        try{
            return result;
        }
        finally {
            result = new StringBuilder("bbb");
        }
    }

    public static void main(String[] args) {
        System.out.println("Test01.m1():"+Test01.m1());
        System.out.println("Test01.m2():"+Test01.m2());
        System.out.println("Test01.m3():"+Test01.m3());
        System.out.println("Test01.m4():"+Test01.m4());
        System.out.println("Test01.m5():"+Test01.m5());
        System.out.println("Test01.m6():"+Test01.m6());
    }
}
