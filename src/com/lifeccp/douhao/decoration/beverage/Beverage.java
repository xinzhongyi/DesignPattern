package com.lifeccp.douhao.decoration.beverage;

/**
 * Created by Administrator on 2018/6/25.
 */
public abstract class Beverage{
    String description = "Unknown Beverage" ;

    public String getDescription(){
        return description ;
    }

    public abstract double cost() ;
}
