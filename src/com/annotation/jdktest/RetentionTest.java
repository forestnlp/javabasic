package com.annotation.jdktest;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/7 - 04 - 07 - 15:17
 * @Description: com.annotation.jdk
 * @version: 1.0
 */
public class RetentionTest {
    @souceAnnotation
    public void m1(){

    }
    @classAnnotation
    public void m2(){

    }
    @runtimeAnnotation
    public void m3(){

    }

    public static void main(String[] args) {

    }
}

@Retention(RetentionPolicy.SOURCE)
@interface souceAnnotation{

}

@Retention(RetentionPolicy.CLASS)
@interface classAnnotation{

}

@Retention(RetentionPolicy.RUNTIME)
@interface runtimeAnnotation{

}