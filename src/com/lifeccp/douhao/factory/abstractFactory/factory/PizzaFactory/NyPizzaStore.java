package com.lifeccp.douhao.factory.abstractFactory.factory.PizzaFactory;

import com.lifeccp.douhao.factory.abstractFactory.factory.PizzaIngredientFactory.NYPizzaIngredientFactory;
import com.lifeccp.douhao.factory.abstractFactory.factory.PizzaIngredientFactory.PizzaIngredientFactory;
import com.lifeccp.douhao.factory.abstractFactory.product.PizzaProduct.NYPizza;
import com.lifeccp.douhao.factory.abstractFactory.product.PizzaProduct.Pizza;
import com.lifeccp.douhao.factory.factoryMethod.product.NYStyleCheesePizza;
import com.lifeccp.douhao.factory.factoryMethod.product.NYStylePepperoniPizza;

/**
 * Created by Administrator on 2018/6/26.
 */
public class NyPizzaStore extends PizzaStore {
    Pizza pizza = null ;
    PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory() ;
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            pizza = new NYPizza(pizzaIngredientFactory);
            pizza.setName("New York Style NYpizza");
        }
        return pizza ;
    }
}
