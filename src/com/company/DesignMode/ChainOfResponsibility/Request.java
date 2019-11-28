package com.company.DesignMode.ChainOfResponsibility;

public class Request {
    private String who_handler;
    private String out;

    public Request(){
        this.who_handler="没有人处理我";
        this.out="无参的构造函数";
    }
    public Request(String who_handler,String out){
        this.who_handler=who_handler;
        this.out=out;
    }

    public void out_myself(){
        System.out.println(out);
    }


    public String getWho_handler() {
        return who_handler;
    }

    public void setWho_handler(String who_handler) {
        this.who_handler = who_handler;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }
}
