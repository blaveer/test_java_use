package com.company.DesignMode.VisitorPattern;

import com.company.DesignMode.VisitorPattern.ConcreteElement.ConcreteElement_A;
import com.company.DesignMode.VisitorPattern.ConcreteElement.ConcreteElement_B;
import com.company.DesignMode.VisitorPattern.ConcreteVisitor.ConcreteVisitor_1;
import com.company.DesignMode.VisitorPattern.ConcreteVisitor.ConcreteVisitor_2;

public class VisitorPattern {
    public static void main(String[] args){
        run();
    }
    private static void run(){
        ObjectStructure os=new ObjectStructure();
        os.add(new ConcreteElement_A());
        os.add(new ConcreteElement_B());
        Visitor v1=new ConcreteVisitor_1();
        os.accept(v1);
        System.out.println("------------------------------------------------------------------------------------------------");
        Visitor v2=new ConcreteVisitor_2();
        os.accept(v2);
    }
}
