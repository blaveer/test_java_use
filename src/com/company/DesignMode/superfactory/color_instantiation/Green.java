package com.company.DesignMode.superfactory.color_instantiation;

import com.company.DesignMode.superfactory.Color;

/**
 * @author 李鑫超
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
