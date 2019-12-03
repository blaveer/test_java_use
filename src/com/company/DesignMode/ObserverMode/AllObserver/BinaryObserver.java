package com.company.DesignMode.ObserverMode.AllObserver;

import com.company.DesignMode.ObserverMode.Observer;
import com.company.DesignMode.ObserverMode.Subject;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject){
//        this.subject=subject;
//        this.subject.attach(this);
        super(subject);
    }
    @Override
    public void update() {
        System.out.println("Binary String   "+Integer.toBinaryString(subject.getState()));
    }
}
