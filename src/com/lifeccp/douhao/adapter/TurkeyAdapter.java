package com.lifeccp.douhao.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/7/10
 * Time: 13:56
 * Description:
 * \
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey ;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0 ; i < 5 ; i ++){
            turkey.fly();
        }
    }
}
