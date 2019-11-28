package com.company.DesignMode.VisitorPattern;

import com.company.DesignMode.VisitorPattern.ConcreteElement.ConcreteElement_A;
import com.company.DesignMode.VisitorPattern.ConcreteElement.ConcreteElement_B;

public interface Visitor {
    void VisitConcreteElementA(ConcreteElement_A element);
    void VisitConcreteElementB(ConcreteElement_B element);
}
