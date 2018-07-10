package com.lifeccp.douhao.Template;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/7/10
 * Time: 14:22
 * Description:
 * \
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea t = new Tea() ;
        Coffee coffee = new Coffee() ;

        t.prepareRecipe();
        coffee.prepareRecipe();
    }
}
