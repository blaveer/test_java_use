package com.company.DesignMode.CommandPattern;

/**一个请求类*/
public class Stock {
    private String name="ABC";
    private int quantity=10;
    public Stock(){}
    public Stock(String name,int quantity){
        this.quantity=quantity;
        this.name=name;
    }
    public void buy(){
        System.out.println("Stock [Name: "+name+", Quantity: "+quantity+"] bought");
    }
    public void sell(){
        System.out.println("Stock [Name: "+name+", Quantity: "+quantity+"] sold");
    }

    public void set(String name,int quantity){
        this.name=name;
        this.quantity=quantity;
    }
}
