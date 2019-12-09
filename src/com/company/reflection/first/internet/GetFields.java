package com.company.reflection.first.internet;

import java.lang.reflect.Field;

/**
 * @author 李鑫超
 */
public class GetFields {
    int a;
    public static void getFieldNames(String className) {

        try {
            //获得类名
            Class c = Class.forName(className);
            //获得所有属性
            Field[] fds = c.getFields();

            for (int i=0; i<fds.length; i++)
            {
                String fn = fds[i].getName();
                Class tc = fds[i].getType();
                String ft = tc.getName();
                System.out.println("该属性的名字为："+fn+"，该属性的类型为："+ft);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        GetFields.getFieldNames("com.company.reflection.first.internet.MyClass");
    }
}
