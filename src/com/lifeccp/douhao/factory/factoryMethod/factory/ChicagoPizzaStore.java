package com.lifeccp.douhao.factory.factoryMethod.factory;

import com.lifeccp.douhao.factory.factoryMethod.product.ChicagoStyleCheesePizza;
import com.lifeccp.douhao.factory.factoryMethod.product.ChicagoStylePepperoniPizza;
import com.lifeccp.douhao.factory.factoryMethod.product.Pizza;

/**
 * Created by Administrator on 2018/6/26.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null ;
        if(type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new ChicagoStylePepperoniPizza() ;
        }
        return pizza;
    }
}
