package com.lifeccp.douhao.factory.factoryMethod;

import com.lifeccp.douhao.factory.factoryMethod.factory.ChicagoPizzaStore;
import com.lifeccp.douhao.factory.factoryMethod.factory.NYPizzaStore;
import com.lifeccp.douhao.factory.factoryMethod.factory.PizzaStore;
import com.lifeccp.douhao.factory.factoryMethod.product.Pizza;

/**
 * Created by Administrator on 2018/6/26.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore() ;
        PizzaStore chicagoStore = new ChicagoPizzaStore() ;

        Pizza pizza = nyPizzaStore.orderPizza("cheese") ;
        System.out.println("Ethan Ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese") ;
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
