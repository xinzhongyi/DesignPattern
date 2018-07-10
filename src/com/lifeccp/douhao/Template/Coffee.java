package com.lifeccp.douhao.Template;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/7/10
 * Time: 14:19
 * Description:
 * \
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
