package com.company.DesignMode.factory.instantiation;

import com.company.DesignMode.factory.Shape;

/**
 * @author 李鑫超
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
