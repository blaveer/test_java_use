package com.company.DesignMode.factory.instantiation;

import com.company.DesignMode.factory.Shape;

/**
 * @author 李鑫超
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
