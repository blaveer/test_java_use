package com.company.reflection.first.myinterface;

import com.company.reflection.first.MyInterface;

/**
 * @author 李鑫超
 */
public class FirstFloor implements MyInterface {
    @Override
    public void reflectionMethod() {
        System.out.println("无参的从接口继承来的函数");
    }

    @Override
    public void reflectionMethod(int p1, boolean p2) {
        System.out.println("有参的从接口继承来的函数，参数是：   "+p1+"     "+p2);
    }
}
