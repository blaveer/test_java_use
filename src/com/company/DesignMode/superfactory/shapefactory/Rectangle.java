package com.company.DesignMode.superfactory.shapefactory;

import com.company.DesignMode.superfactory.Shape;

/**
 * @author 李鑫超
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
