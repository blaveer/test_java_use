package com.company.reflection.first.internet;

/**
 * @author 李鑫超
 */
public class GetInterfaces {
    public static void getInterfaces(String className) {
        try {
            //取得类
            Class cl = Class.forName(className);
            Class[] ifs = cl.getInterfaces();
            for (int i = 0; i<ifs.length;i++)
            {
                String IName = ifs[i].getName();
                System.out.println("该类实现的接口名字为："+IName);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        GetInterfaces.getInterfaces("com.company.reflection.first.myinterface.FirstFloor");
    }
}
