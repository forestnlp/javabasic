package com.generic;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/7 - 04 - 07 - 9:50
 * @Description: com.generic
 * @version: 1.0
 */

public class Test3 {

    static class Entry<K,V> {
        private K key;
        private V val;

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getVal() {
            return val;
        }

        public void setVal(V val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Entry<Integer,String> entry = new Entry<>();
        entry.setKey(200);
        entry.setVal("成功");
        System.out.println(entry.getKey()+","+entry.getVal());
    }
}
