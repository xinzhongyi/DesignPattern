package com.lifeccp.douhao.decoration.beverage;

import com.lifeccp.douhao.decoration.beverage.Beverage;

/**
 * Created by Administrator on 2018/6/25.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast" ;
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
