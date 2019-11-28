package com.company.DesignMode.ChainOfResponsibility;

import com.company.DesignMode.ChainOfResponsibility.ConcreteHandler.ConcreteHandler_1;
import com.company.DesignMode.ChainOfResponsibility.ConcreteHandler.ConcreteHandler_2;
import com.company.DesignMode.ChainOfResponsibility.ConcreteHandler.ConcreteHandler_3;

public class Chain_header {
    public static void main(String[] args){
        run();
    }
    private static void run(){
        Request request=new Request("three","我确实被处理了");
        Handler h1=new ConcreteHandler_1();
        Handler h2=new ConcreteHandler_2();
        Handler h3=new ConcreteHandler_3();
        h1.setNext(h2);
        h2.setNext(h3);
        h1.handlerRequest(request);
    }

}
