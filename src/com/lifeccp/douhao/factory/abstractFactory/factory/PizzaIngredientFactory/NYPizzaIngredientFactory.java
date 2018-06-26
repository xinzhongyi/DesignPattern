package com.lifeccp.douhao.factory.abstractFactory.factory.PizzaIngredientFactory;

import com.lifeccp.douhao.factory.abstractFactory.product.PizzaIngredientProduct.Dough;
import com.lifeccp.douhao.factory.abstractFactory.product.PizzaIngredientProduct.MarinaraSauce;
import com.lifeccp.douhao.factory.abstractFactory.product.PizzaIngredientProduct.Sauce;
import com.lifeccp.douhao.factory.abstractFactory.product.PizzaIngredientProduct.ThinCrustDough;

/**
 * Created by Administrator on 2018/6/26.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
