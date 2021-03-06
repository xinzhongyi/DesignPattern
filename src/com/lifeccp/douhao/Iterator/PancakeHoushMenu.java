package com.lifeccp.douhao.Iterator;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/7/11.
 */
public class PancakeHoushMenu implements Menu{
    private ArrayList menuItems ;

    public PancakeHoushMenu() {
        menuItems = new ArrayList() ;

        addItem("K&B's Pancake Breafast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular Pancake Breafast",
                "Pancakes with fried eggs, sausage",
                true,
                2.99);

        addItem("Blueberry Pancake",
                "Pancakes made with fresh buleberries",
                true,
                3.49);

        addItem("Waffles",
                "Waffles,with you choice of blueberries or strawberries",
                true,
                3.59);

    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price) ;
        menuItems.add(menuItem) ;
    }

    public MyIterator createIterator(){
        return new PancakeIterator(menuItems) ;
    }
}
