package com.lifeccp.douhao.Template;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/7/10
 * Time: 14:19
 * Description:
 * \
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
