package com.company.DesignMode.VisitorPattern.ConcreteVisitor;

import com.company.DesignMode.VisitorPattern.ConcreteElement.ConcreteElement_A;
import com.company.DesignMode.VisitorPattern.ConcreteElement.ConcreteElement_B;
import com.company.DesignMode.VisitorPattern.Visitor;

public class ConcreteVisitor_1 implements Visitor {
    @Override
    public void VisitConcreteElementA(ConcreteElement_A element) {
        System.out.println("我是访问者1，我要访问"+element.operation());
    }

    @Override
    public void VisitConcreteElementB(ConcreteElement_B element) {
        System.out.println("我是访问者1，我要访问"+element.operation());
    }
}
