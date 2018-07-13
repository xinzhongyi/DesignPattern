package com.lifeccp.douhao.composite;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/7/13
 * Time: 10:24
 * Description:
 * \
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException() ;
    }
}
