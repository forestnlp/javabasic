package com.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/7 - 04 - 07 - 9:50
 * @Description: com.generic
 * @version: 1.0
 */

public class Test2 {

    static class Message<T> {
        private T t;

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }
    }

    public static void main(String[] args) {
        Message<String> message = new Message<>();
        message.setT("abc");
        System.out.println(message.getT());
    }
}
