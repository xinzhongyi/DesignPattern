package com.lifeccp.douhao.factory.abstractFactory.product.PizzaIngredientProduct;

/**
 * Created by Administrator on 2018/6/26.
 */
public class ThinCrustDough implements Dough {
    @Override
    public String putDough() {
        return "Put ThinCrust Dough";
    }
}
