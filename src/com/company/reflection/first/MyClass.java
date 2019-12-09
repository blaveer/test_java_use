package com.company.reflection.first;

/**
 * @author 李鑫超
 */
public class MyClass {
    public int temp_int;
    private String temp_string;
    protected boolean temp_is;
    public void temp_public_method(){
        System.out.println("这是我写的基类，无参的函数");
    }
    public void temp_public_method(int temp_int){
        System.out.println("这是我写的基类，有参的函数，参数是："+temp_int);
    }
    private void temp_private_method(){
        System.out.println("这是我写的基类，私有的函数，无参");
    }
    private void temp_private_method(int temp_int){
        System.out.println("这是我写的基类，私有的函数，有参，参数是："+temp_int);
    }
    protected void temp_protected_method(){
        System.out.println("这是我写的基类，保护的函数，无参");
    }
    protected void temp_protected_method(int temp_int){
        System.out.println("这是我写的基类，保护的函数，有参，参数是："+temp_int);
    }

    public String temp_return_method(){
        System.out.println("这是基类，这是唯一一个有返回值的函数");
        return Integer.MAX_VALUE+"";
    }

}
