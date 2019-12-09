package com.company.reflection.first.myclass;

import com.company.reflection.first.MyClass;

/**
 * @author 李鑫超
 */
public class FirstFloor extends MyClass {
    @Override
    public void temp_public_method() {
        System.out.print("我是第一层子类，这是无参的公开的函数");
        super.temp_public_method();
    }

    @Override
    public void temp_public_method(int temp_int) {
        System.out.print("我是第一层子类，这是有参的公开的函数");
        super.temp_public_method(temp_int);
    }

    @Override
    protected void temp_protected_method() {
        System.out.print("我是第一层子类，这是无参的保护的函数");
        super.temp_protected_method();
    }

    @Override
    protected void temp_protected_method(int temp_int) {
        System.out.print("我是第一层子类，这是有参的保护的函数");
        super.temp_protected_method(temp_int);
    }

    @Override
    public String temp_return_method() {
        return super.temp_return_method();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
