package com.company.Array;

import com.company.Array.USE.Thread_Array;

import java.util.ArrayList;
import java.util.LinkedList;

import static java.lang.Math.E;

public class ArrayList_LinkedList {

    public static int counter_num=0;

    public ArrayList_LinkedList(){
        //System.out.println(Integer.MAX_VALUE);
        //System.out.println(E);
    }
    public void run(){
        linked_storage();
    }

    /**如果他的内存本身就是不连续的，是通过链表实现的，那么应该每次输出都一样呀，事实是没100个输出一次都不一样*/
    private void linked_storage(){
        LinkedList<String> t=new LinkedList<>();
        int counter=0;
        try {
            while(counter<1000){
                if(counter%100==0){
                    System.out.println(t.hashCode());
                }
                t.add(String.valueOf(counter));
                counter++;
            }
        }
        catch (Exception ex){
            System.out.println(counter);
            System.out.println(t.size());
            System.out.println(ex);
        }
        System.out.println(t.hashCode());
    }

    /**这个也是线程不安全*/
    private void run_LinkedList() {
        LinkedList<String> s=new LinkedList<>();
        Thread_Array t1=new Thread_Array(s,"第一个线程");
        Thread_Array t2=new Thread_Array(s,"第二个线程");
        t1.start();
        t2.start();
        while(counter_num<2){
            continue;
        }
        System.out.println(s.size());
    }


    /**Array是线程不安全的，这里两个线程分别添加10000个，第一次执行结果就是19409*/
    private void run_thread(){
        ArrayList<String> s=new ArrayList<>();
        Thread_Array t1=new Thread_Array(s,"第一个线程");
        Thread_Array t2=new Thread_Array(s,"第二个线程");
        t1.start();
        t2.start();
        while(counter_num<2){
            continue;
        }
        System.out.println(s.size());
    }

    /**在这里我觉得根据输出结果可以判断ArrayList的内存是连续的，
     * 由于hashCode这个函数的一些特性使得每次输出的都是引用的初始地址，除非这个引用被重新初始化
     * 由于当数组数量巨大的时候内存不连续了，所以猜测是新初始化了一个Array List对象，但是其中的元素并未初始化
     * 所以导致了，ArrayList对象的地址在变，而其元素的地址并未改变。其实可以这么理解，每次增加元素的时候都会首先判断接下面的内存够不够，
     * 如果不够，就寻找一块新的内存区域，初始化一个新的List对象，然后改变其中元素的实际地址，故而其hashCode并未改变
     * */
    private void run_arr_storage(){
        ArrayList<String> t=new ArrayList<>();
        int counter=0;
        try {
            System.out.println(t.hashCode());
            while(counter<1000){
//                if(counter%100==0){
//                    System.out.println(counter);
//                }
                t.add(String.valueOf(counter));

                counter++;
            }
        }
        catch (Exception ex){
            System.out.println(counter);
            System.out.println(t.size());
            System.out.println(ex);
        }
        System.out.println(t.hashCode());
        for(int i=0;i<t.size();i++){
            //System.out.println(t.get(i).hashCode());
        }
    }

}
