package com.lifeccp.douhao.factory.abstractFactory.factory.PizzaFactory;

import com.lifeccp.douhao.factory.abstractFactory.product.PizzaProduct.Pizza;

/**
 * Created by Administrator on 2018/6/26.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza ;
        pizza = createPizza(type) ;
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza ;
    }

    protected abstract Pizza createPizza(String type) ;
}
