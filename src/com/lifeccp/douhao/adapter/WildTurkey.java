package com.lifeccp.douhao.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/7/10
 * Time: 13:55
 * Description:
 * \
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
