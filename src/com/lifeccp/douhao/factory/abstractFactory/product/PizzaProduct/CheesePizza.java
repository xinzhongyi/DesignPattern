package com.lifeccp.douhao.factory.abstractFactory.product.PizzaProduct;

import com.lifeccp.douhao.factory.abstractFactory.factory.PizzaIngredientFactory.PizzaIngredientFactory;

/**
 * Created by Administrator on 2018/6/26.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory ;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Prepareing " + name);
        dough = pizzaIngredientFactory.createDough() ;
        sauce = pizzaIngredientFactory.createSauce() ;
    }
}
