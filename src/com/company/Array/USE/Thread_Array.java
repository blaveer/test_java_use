package com.company.Array.USE;

import java.util.ArrayList;
import java.util.LinkedList;

import static com.company.Array.ArrayList_LinkedList.counter_num;

public class Thread_Array extends Thread {
    private ArrayList<String> t1=null;
    private LinkedList<String> t2=null;
    private String name;
    private int run_what=0;
    public Thread_Array(ArrayList<String> t,String name){
        this.t1=t;
        this.name=name;
        this.run_what=1;
    }
    public Thread_Array(LinkedList<String> t,String name){
        this.t2=t;
        this.name=name;
        this.run_what=2;
    }

    @Override
    public void run(){
        switch (run_what){
            case 1:
                for_ArrayList();
                break;
            case 2:
                for_LinkedList();
                break;
            default:break;
        }

    }

    private void for_ArrayList(){
        for(int counter=0;counter<10000;counter++){
            t1.add(name+counter);
        }
        counter_num++;
    }

    private void for_LinkedList(){
        for(int counter=0;counter<10000;counter++){
            t2.add(name+counter);
        }
        counter_num++;
    }

}
