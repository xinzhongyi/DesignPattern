package com.lifeccp.douhao.factory.factoryMethod.product;

import com.lifeccp.douhao.factory.factoryMethod.product.Pizza;

/**
 * Created by Administrator on 2018/6/26.
 */
public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "NY Style Sauce and Pepper Pizza" ;
        dough = "Thin Crust Dough" ;
        sauce = "Marinara Sauce" ;
        topping.add("Grated Reggiano Pepper") ;
    }
}
