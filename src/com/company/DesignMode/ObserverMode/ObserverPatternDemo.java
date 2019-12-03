package com.company.DesignMode.ObserverMode;

import com.company.DesignMode.ObserverMode.AllObserver.BinaryObserver;
import com.company.DesignMode.ObserverMode.AllObserver.HexaObserver;
import com.company.DesignMode.ObserverMode.AllObserver.OctalObserver;

public class ObserverPatternDemo {
    public static void main(String [] arg){
        Subject subject=new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        subject.setState(8);
        subject.setState(15);

    }
}
