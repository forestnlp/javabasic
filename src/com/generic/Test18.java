package com.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/7 - 04 - 07 - 9:59
 * @Description: com.generic
 * @version: 1.0
 */
public class Test18 {
   static class C<T>{
       private T val;

       public T getVal() {
           return val;
       }

       public void setVal(T val) {
           this.val = val;
       }
   }

   static class D extends C<String>{

       @Override
       public String getVal() {
           return super.getVal();
       }

       @Override
       public void setVal(String val) {
           super.setVal(val);
       }
   }

    public static void main(String[] args) {
        C c = new C();
        c.setVal(new Object());
        D d = new D();
       // d.setVal(new Object());
   }
}
