package com.lifeccp.douhao.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/7/12
 * Time: 15:39
 * Description:
 * \
 */
public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList() ;
    String name ;
    String description ;

    public Menu(String name,String description) {
        this.name = name ;
        this.description = description ;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent) ;
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("-------------------");

        Iterator iterator = menuComponents.iterator() ;
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public Iterator iterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
