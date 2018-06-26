package com.lifeccp.douhao.factory.factoryMethod.product;

import com.lifeccp.douhao.factory.factoryMethod.product.Pizza;

/**
 * Created by Administrator on 2018/6/26.
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Deep Dish Pepperoni Pizza" ;
        dough = "Extra Thick Crust Dough" ;
        sauce = "Plum Tomato Sauce" ;
        topping.add("Shredded Mozzarella Pepperoni") ;
    }

    public void cut(){
        System.out.println("Cutting the Pizza into square slices");
    }
}
