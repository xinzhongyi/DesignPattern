package com.lifeccp.douhao.factory.factoryMethod.product;

import com.lifeccp.douhao.factory.factoryMethod.product.Pizza;

/**
 * Created by Administrator on 2018/6/26.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza" ;
        dough = "Extra Thick Crust Dough" ;
        sauce = "Plum Tomato Sauce" ;
        topping.add("Shredded Mozzarella Cheese") ;
    }

    public void cut(){
        System.out.println("Cutting the Pizza into square slices");
    }
}
