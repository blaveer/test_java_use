package com.company.DesignMode.superfactory.color_instantiation;

import com.company.DesignMode.superfactory.Color;

/**
 * @author 李鑫超
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
