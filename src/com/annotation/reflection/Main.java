package com.annotation.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/8 - 04 - 08 - 11:33
 * @Description: com.annotation.reflection
 * @version: 1.0
 */
public class Main {

    @Override
    @SimpleAnnotation(title = "toString",description = "override toString")
    public String toString() {
        return "Main{}";
    }

    @Deprecated
    @SimpleAnnotation(title = "oldmethod",description = "do not use it")
    public static void old(){
        System.out.println("old method call ");
    }

    @SuppressWarnings({"unchecked","desc"})
    @SimpleAnnotation(title = "raw method",description = "suppress warning")
    public static void raw(){
        List l1 = new ArrayList<>();
        l1.add("ab");
        old();
    }

    public static void main(String[] args) {
        Method[] methods = Main.class.getMethods();
        for(Method method:methods) {
            if(method.isAnnotationPresent(SimpleAnnotation.class)){
                for(Annotation annotation:method.getDeclaredAnnotations()) {
                    System.out.println("method "+ method.getName() +"() has an annotation : "+ annotation.annotationType()+",title="+method.getAnnotation(SimpleAnnotation.class).title());
                }
            }
        }
    }
}
