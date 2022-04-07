package com.generic;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/7 - 04 - 07 - 9:59
 * @Description: com.generic
 * @version: 1.0
 */
public class Test4 {
    interface Response<T> {
        public T getVar();
    }

    static class ResponseImpl<T> implements Response<T> {
        private T var;

        @Override
        public T getVar() {
            return var;
        }

        public void setVar(T var) {
            this.var = var;
        }

        public ResponseImpl(T var) {
            this.var = var;
        }
    }

    public static void main(String[] args) {
        Response<String> response = new ResponseImpl<>("abc");
        System.out.println(response.getVar());
    }
}
