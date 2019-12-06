package com.company.DesignMode.superfactory.shapefactory;

import com.company.DesignMode.superfactory.Shape;

/**
 * @author 李鑫超
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
