package com.lifeccp.douhao.Iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2018/7/11.
 */
public class PancakeIterator implements MyIterator {
    List items ;
    Iterator iterator ;

    public PancakeIterator(List items) {
        this.items = items;
        this.iterator = items.iterator() ;
    }

    @Override
    public boolean hasNext() {
        return this.iterator.hasNext() ;
    }

    @Override
    public Object next() {
        return this.iterator.next();
    }

    @Override
    public void remove() {
        iterator.remove();
    }
}
