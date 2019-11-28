package com.company.DesignMode.VisitorPattern.ConcreteElement;

import com.company.DesignMode.VisitorPattern.Element;
import com.company.DesignMode.VisitorPattern.Visitor;

public class ConcreteElement_A implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.VisitConcreteElementA(this);
    }

    @Override
    public String operation() {
        return "这是元素A";
    }
}
