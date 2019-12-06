package com.company.DesignMode.superfactory;

/**
 * @author 李鑫超
 */
public abstract class AbstractFactory {
    /**
     * &#x83b7;&#x53d6;&#x5230;&#x4e00;&#x4e2a;Color&#x7684;&#x5b9e;&#x4f8b;&#x5316;&#x53d8;&#x91cf;
     * @param color &#x4e00;&#x4e2a;&#x989c;&#x8272;&#x7c7b;&#x578b;&#x7684;&#x53d8;&#x91cf;
     * @return &#x4e00;&#x4e2a;Color&#x7684;&#x5b9e;&#x4f8b;&#x5316;&#x53d8;&#x91cf;
     * */
    public abstract Color getColor(String color);

    /**
     * 获取到一个Shape的实例化变量
     * @param shape 一个形状的变量
     * @return 一个Shape的变量
     * */
    public abstract Shape getShape(String shape) ;
}
