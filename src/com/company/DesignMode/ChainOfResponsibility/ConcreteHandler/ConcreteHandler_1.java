package com.company.DesignMode.ChainOfResponsibility.ConcreteHandler;

import com.company.DesignMode.ChainOfResponsibility.Handler;
import com.company.DesignMode.ChainOfResponsibility.Request;

public class ConcreteHandler_1 extends Handler {
    @Override
    public void handlerRequest(Request request) {
        if(request.getWho_handler().equals("one")){
            System.out.println("这个请求被我第一个处理对象给处理了");
            request.out_myself();
        }
        else{
            if(getNext()!=null){
                getNext().handlerRequest(request);
            }else{
                System.out.println("没有人要处理它");
            }
        }
    }

}
