package com.lifeccp.douhao.factory.abstractFactory.product.PizzaProduct;

import com.lifeccp.douhao.factory.abstractFactory.factory.PizzaIngredientFactory.PizzaIngredientFactory;

/**
 * Created by Administrator on 2018/6/26.
 */
public class NYPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory ;

    public NYPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Prepareing " + name);
        dough = pizzaIngredientFactory.createDough() ;
    }
}
