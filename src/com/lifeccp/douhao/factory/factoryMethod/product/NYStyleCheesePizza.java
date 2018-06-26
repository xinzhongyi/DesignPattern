package com.lifeccp.douhao.factory.factoryMethod.product;

import com.lifeccp.douhao.factory.factoryMethod.product.Pizza;

/**
 * Created by Administrator on 2018/6/26.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza" ;
        dough = "Thin Crust Dough" ;
        sauce = "Marinara Sauce" ;
        topping.add("Grated Reggiano Cheese") ;
    }
}
