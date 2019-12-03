package com.company.DesignMode.CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李鑫超
 */
public class Broker {
    private List<Order> orders=new ArrayList<Order>();
    public void takeOrder(Order order){
        orders.add(order);
    }
    public void placeOrder(boolean isClear){
        for(Order order : orders){
            order.execute();
        }
        if(isClear) {
            orders.clear();
        }
    }
}
