package com.company.DesignMode.ObserverMode.AllObserver;

import com.company.DesignMode.ObserverMode.Observer;
import com.company.DesignMode.ObserverMode.Subject;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject){
//        this.subject=subject;
//        this.subject.attach(this);
        super(subject);
    }
    @Override
    public void update() {
        System.out.println("Octal String   "+Integer.toOctalString(subject.getState()));
    }
}
