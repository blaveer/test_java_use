package com.company.DesignMode.VisitorPattern;

public interface Element {
    void accept(Visitor visitor);
    String operation();
}
