package com.lifeccp.douhao.factory.factoryMethod.product;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/6/26.
 */
public abstract class Pizza {
    String name ;
    String dough ;
    String sauce ;
    ArrayList topping = new ArrayList() ;

    public void prepare(){
        System.out.println("Prepareing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding topping: ");
        topping.forEach(obj -> {
            System.out.println("   " + obj);
        });
    }

    public void bake(){
        System.out.println("Bake for 25 minuters at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name ;
    }
}
