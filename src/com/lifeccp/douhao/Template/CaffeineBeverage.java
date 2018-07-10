package com.lifeccp.douhao.Template;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/7/10
 * Time: 14:17
 * Description:
 * \
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    abstract void brew() ;

    abstract void addCondiments() ;

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments(){
        return true ;
    }
}
