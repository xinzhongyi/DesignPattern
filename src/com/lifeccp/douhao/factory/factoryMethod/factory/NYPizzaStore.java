package com.lifeccp.douhao.factory.factoryMethod.factory;

import com.lifeccp.douhao.factory.factoryMethod.product.NYStyleCheesePizza;
import com.lifeccp.douhao.factory.factoryMethod.product.NYStylePepperoniPizza;
import com.lifeccp.douhao.factory.factoryMethod.product.Pizza;

/**
 * Created by Administrator on 2018/6/26.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null ;
        if(type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new NYStylePepperoniPizza() ;
        }
        return pizza;
    }
}
