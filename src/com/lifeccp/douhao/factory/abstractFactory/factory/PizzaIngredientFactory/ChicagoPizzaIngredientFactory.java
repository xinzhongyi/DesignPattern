package com.lifeccp.douhao.factory.abstractFactory.factory.PizzaIngredientFactory;

import com.lifeccp.douhao.factory.abstractFactory.product.PizzaIngredientProduct.Dough;
import com.lifeccp.douhao.factory.abstractFactory.product.PizzaIngredientProduct.PlumTomatoSauce;
import com.lifeccp.douhao.factory.abstractFactory.product.PizzaIngredientProduct.Sauce;
import com.lifeccp.douhao.factory.abstractFactory.product.PizzaIngredientProduct.ThickCrustDough;

/**
 * Created by Administrator on 2018/6/26.
 */
public class ChicagoPizzaIngredientFactory implements  PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
}
