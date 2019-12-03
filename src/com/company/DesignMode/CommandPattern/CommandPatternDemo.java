package com.company.DesignMode.CommandPattern;

import com.company.DesignMode.CommandPattern.OrderInstantiation.BuyStock;
import com.company.DesignMode.CommandPattern.OrderInstantiation.SellStock;

/**
 * @author 李鑫超
 */
public class CommandPatternDemo {
    public static void main(String[] args){
        Stock myStock=new Stock();
        BuyStock buyStockOrder=new BuyStock(myStock);
        SellStock sellStockOrder=new SellStock(myStock);
        Broker broker=new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrder(true);

    }
}
