package com.lifeccp.douhao.composite;

import com.sun.xml.internal.ws.server.UnsupportedMediaException;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/7/12
 * Time: 14:06
 * Description:
 * \
 */
public abstract class MenuComponent {

    //组合方法
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException() ;
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException() ;
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException() ;
    }

    //操作方法
    public String getName(){
        throw new UnsupportedOperationException() ;
    }

    public String getDescription(){
        throw new UnsupportedOperationException() ;
    }

    public double getPrice(){
        throw new UnsupportedOperationException() ;
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException() ;
    }

    public void print(){
        throw new UnsupportedOperationException() ;
    }

    public Iterator iterator(){throw new UnsupportedOperationException() ;}
}
