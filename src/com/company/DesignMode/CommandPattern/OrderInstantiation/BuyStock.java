package com.company.DesignMode.CommandPattern.OrderInstantiation;

import com.company.DesignMode.CommandPattern.Order;
import com.company.DesignMode.CommandPattern.Stock;

public class BuyStock implements Order {
    private Stock myStock;

    public BuyStock(Stock stock){
        this.myStock=stock;
    }

    @Override
    public void execute() {
        myStock.buy();
    }
}
