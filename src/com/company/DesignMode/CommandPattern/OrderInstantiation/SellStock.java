package com.company.DesignMode.CommandPattern.OrderInstantiation;

import com.company.DesignMode.CommandPattern.Order;
import com.company.DesignMode.CommandPattern.Stock;

public class SellStock implements Order {
    private Stock myStock;

    public SellStock(Stock stock){
        this.myStock=stock;
    }

    @Override
    public void execute() {
        myStock.sell();
    }
}
