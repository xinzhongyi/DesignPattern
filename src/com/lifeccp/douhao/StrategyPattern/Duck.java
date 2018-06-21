package com.lifeccp.douhao.StrategyPattern;

import com.lifeccp.douhao.StrategyPattern.behavior.FlyBehavior;
import com.lifeccp.douhao.StrategyPattern.behavior.QuackBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/6/21
 * Time: 17:27
 * Description:
 * \
 */
public abstract class Duck {
    FlyBehavior flyBehavior ;
    QuackBehavior quackBehavior ;

    public Duck(){} ;

    public abstract void display() ;

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All duck float ,even decoys");
    }

    public void setFlyBehavior(FlyBehavior fb){
        this.flyBehavior = fb ;
    }

    public void setQuackBehavior(QuackBehavior qb){
        this.quackBehavior = qb ;
    }
}
