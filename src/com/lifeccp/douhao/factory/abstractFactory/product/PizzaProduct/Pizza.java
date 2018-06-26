package com.lifeccp.douhao.factory.abstractFactory.product.PizzaProduct;

import com.lifeccp.douhao.factory.abstractFactory.product.PizzaIngredientProduct.Dough;
import com.lifeccp.douhao.factory.abstractFactory.product.PizzaIngredientProduct.Sauce;

/**
 * Created by Administrator on 2018/6/26.
 */
public abstract class Pizza {
    String name ;
    Dough dough ;
    Sauce sauce ;

    public abstract void prepare() ;

    public void bake(){
        System.out.println("Bake for 25 minuters at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Pizza name: " + name +" Dough :" + dough.putDough() + " Sauce: " + sauce.putSauce();
    }
}
