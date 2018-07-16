package com.lifeccp.douhao.proxy.personalProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/7/16
 * Time: 10:18
 * Description:
 * \
 */
public class OwnerInvocationHandler implements InvocationHandler {

    PersonBean personBean ;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("get")){
            return method.invoke(personBean,args) ;
        }else if(method.getName().equals("setHotOrNotRating")){
            throw new IllegalAccessException() ;
        }else if(method.getName().startsWith("set")){
            return method.invoke(personBean,args) ;
        }
        return null;
    }
}
