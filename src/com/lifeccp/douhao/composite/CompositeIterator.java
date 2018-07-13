package com.lifeccp.douhao.composite;

import java.util.Iterator;
import java.util.Stack;
import java.util.function.Consumer;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/7/13
 * Time: 10:16
 * Description:
 * \
 */
public class CompositeIterator implements Iterator {
    Stack stack = new Stack() ;

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator) ;
    }

    @Override
    public boolean hasNext() {
        if(stack.isEmpty()){
            return  false ;
        }else{
            Iterator iterator = (Iterator) stack.peek();
            if(!iterator.hasNext()){
                stack.pop() ;
                return hasNext() ;
            }else{
                return true ;
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if(menuComponent instanceof  Menu){
                stack.push(menuComponent.iterator()) ;
            }
            return menuComponent ;
        }else{
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException() ;
    }
}
