package com.lifeccp.douhao.factory.abstractFactory.factory.PizzaIngredientFactory;

import com.lifeccp.douhao.factory.abstractFactory.product.PizzaIngredientProduct.Dough;
import com.lifeccp.douhao.factory.abstractFactory.product.PizzaIngredientProduct.Sauce;

/**
 * Created by Administrator on 2018/6/26.
 */
public interface PizzaIngredientFactory {
    public Dough createDough() ;
    public Sauce createSauce() ;
}
