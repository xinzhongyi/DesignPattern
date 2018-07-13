package com.lifeccp.douhao.composite;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/7/12
 * Time: 15:44
 * Description:
 * \
 */
public class Waitness {

    MenuComponent allMenus ;

    public Waitness(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator iterator = allMenus.iterator() ;
        System.out.println("\nVEGETARIAN MENNU \n----------");
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try{
                if(menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }catch (Exception e){
                System.out.println("MENU is not print");
            }
        }
    }
}
