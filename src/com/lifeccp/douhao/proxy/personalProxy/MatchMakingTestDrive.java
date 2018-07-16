package com.lifeccp.douhao.proxy.personalProxy;

import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: sks
 * Date: 2018/7/16
 * Time: 14:52
 * Description:
 * \
 */
public class MatchMakingTestDrive {

    public static void main(String[] args) {
        MatchMakingTestDrive matchMakingTestDrive = new MatchMakingTestDrive() ;
        matchMakingTestDrive.drive();
    }

    public void drive() {
        PersonBean joe = new PersonalImpl();
        joe.setName("joe");
        joe.setGender("man");
        joe.setInterests("eat");

        PersonBean ownerProxy = getOwnerProxy(joe) ;
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling,Go");
        System.out.println("Interests set from owner proxy");
        try{
            ownerProxy.setHotOrNotRating(10);
        }catch (Exception e){
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());


        PersonBean nonOwnerProxy = getNonOwnerProxy(joe) ;
        System.out.println("Name is " + nonOwnerProxy.getName());
        try{
            nonOwnerProxy.setInterests("bowling,go");
        }catch (Exception e){
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    public PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), new OwnerInvocationHandler(personBean));
    }

    public PersonBean getNonOwnerProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), new NonOwnerInvocationHandler(personBean));
    }
}
