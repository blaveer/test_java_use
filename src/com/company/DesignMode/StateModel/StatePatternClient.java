package com.company.DesignMode.StateModel;

public class StatePatternClient {
    public static void main(String[] args){
        run();
    }
    private static void run(){
        Context context=new Context();
        for(int counter=0;counter<6;counter++){
            context.Handle();
        }
    }
}
