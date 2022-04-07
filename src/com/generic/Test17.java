package com.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/7 - 04 - 07 - 9:59
 * @Description: com.generic
 * @version: 1.0
 */
public class Test17 {
    public static void main(String[] args) {
        List<String> l1  = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Object> l3 = new ArrayList<>();
        l3.add("abc");
        l3.addAll(l1);
    }
}
