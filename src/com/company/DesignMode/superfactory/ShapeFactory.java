package com.company.DesignMode.superfactory;

import com.company.DesignMode.superfactory.shapefactory.*;

/**
 * @author 李鑫超
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape == null){
            return null;
        }
        if("CIRCLE".equalsIgnoreCase(shape)){
            return new Circle();
        } else if("RECTANGLE".equalsIgnoreCase(shape)){
            return new Rectangle();
        } else if("SQUARE".equalsIgnoreCase(shape)){
            return new Square();
        }
        return null;
    }
}
