package com.lifeccp.douhao.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/7/10
 * Time: 13:54
 * Description:
 * \
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
