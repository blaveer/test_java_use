package com.company.DesignMode.VisitorPattern.ConcreteElement;

import com.company.DesignMode.VisitorPattern.Element;
import com.company.DesignMode.VisitorPattern.Visitor;

public class ConcreteElement_B implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.VisitConcreteElementB(this);
    }

    @Override
    public String operation() {
        return "这是元素B";
    }
}
