package com.annotation.jdk;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/7 - 04 - 07 - 14:47
 * @Description: com.annotation.jdk
 * @version: 1.0
 */
public @Deprecated class A {
    public void test() {
    }

    @Deprecated
    public void oldmethod(){

    }

    @SuppressWarnings("checked")
    public void fileopen(){
    }
}

class B extends A {
    @Override
    public void test() {
        super.test();
    }
}