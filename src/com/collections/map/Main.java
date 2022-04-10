package com.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,null);
        String s = map.get(null);
        System.out.println(s);
    }
}
