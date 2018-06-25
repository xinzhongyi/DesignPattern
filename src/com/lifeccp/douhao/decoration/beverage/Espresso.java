package com.lifeccp.douhao.decoration.beverage;

import com.lifeccp.douhao.decoration.beverage.Beverage;

/**
 * Created by Administrator on 2018/6/25.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso" ;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
