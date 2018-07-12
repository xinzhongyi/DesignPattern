package com.lifeccp.douhao.state;

/**
 * Created by Administrator on 2018/7/12.
 */
public class SoldOutState implements State {
    private GumballMachine gumballMachine ;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert quarter,the machine is sold out");
    }

    @Override
    public void ejectQuareter() {
        System.out.println("You can't eject,you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned,but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
