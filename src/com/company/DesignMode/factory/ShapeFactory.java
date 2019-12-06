package com.company.DesignMode.factory;

import com.company.DesignMode.factory.instantiation.Circle;
import com.company.DesignMode.factory.instantiation.Rectangle;
import com.company.DesignMode.factory.instantiation.Square;

/**
 * @author 李鑫超
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if (!"CIRCLE".equals(shapeType)) {
            if("RECTANGLE".equals(shapeType)){
                return new Rectangle();
            }
            else if("SQUARE".equals(shapeType)){
                return new Square();
            }
        } else {
            return new Circle();
        }
        return null;
    }
}
