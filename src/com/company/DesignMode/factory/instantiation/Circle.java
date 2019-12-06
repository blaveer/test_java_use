package com.company.DesignMode.factory.instantiation;

import com.company.DesignMode.factory.Shape;

/**
 * @author 李鑫超
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
