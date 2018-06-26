package com.lifeccp.douhao.factory.factoryMethod.factory;

import com.lifeccp.douhao.factory.factoryMethod.product.Pizza;

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
