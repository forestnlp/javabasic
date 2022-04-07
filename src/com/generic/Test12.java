package com.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/7 - 04 - 07 - 9:59
 * @Description: com.generic
 * @version: 1.0
 */
public class Test12 {
    interface Staff{
        int getSalary();
    }

    interface Passenger{
        boolean isStanding();
    }

    static class Person implements Staff,Passenger {
        @Override
        public int getSalary() {
            return 11110;
        }

        @Override
        public boolean isStanding() {
            return false;
        }
    }

    //工资低于2500元的上斑族并且站立的乘客车票打8折
    public static <T extends Staff & Passenger> void discount(T t){
        if(t.getSalary()<2500 && t.isStanding()){
            System.out.println("恭喜你！您的车票打八折！");
        }
    }

    public static void main(String[] args) {
        discount(new Person());
    }
}
