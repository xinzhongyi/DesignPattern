package com.lifeccp.douhao.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 2018/7/11.
 */
public class Waitress2 {
    ArrayList menus;

    public Waitress2(ArrayList menus) {
        this.menus = menus;
    }

    public void printMenu(){
        Iterator iterator = menus.iterator() ;
        while (iterator.hasNext()){
            Menu menu = (Menu) iterator.next();
            printMenu(menu.createIterator());
        }
    }

    public void printMenu(MyIterator myIterator){
        while(myIterator.hasNext()){
            MenuItem menuItem = (MenuItem) myIterator.next();
            System.out.print(menuItem.getName() + ",");
            System.out.print(menuItem.getPrice() + "--");
            System.out.println(menuItem.getDescription());
        }
    }
}
