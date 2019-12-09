package com.company.reflection.first;

/**
 * @author 李鑫超
 */
public interface MyInterface {
    int temp_int=10;

    /**这个函数只是用来表示无参的函数*/
    void reflectionMethod();
    /**
     * 函数本省也没有特殊的含义
     * @param p1 两个参数都没有特殊的含义，只是代表有参数的函数
     * @param p2 无特殊含义
     * */
    void reflectionMethod(int p1,boolean p2);
}
