package com.company.DesignMode.ObserverMode.AllObserver;

import com.company.DesignMode.ObserverMode.Observer;
import com.company.DesignMode.ObserverMode.Subject;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject){
//        this.subject=subject;
//        this.subject.attach(this);
        super(subject);
    }
    @Override
    public void update() {
        System.out.println("Hex String   "+Integer.toHexString(subject.getState()));
    }
}
