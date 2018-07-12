package com.lifeccp.douhao.state;

/**
 * Created by Administrator on 2018/7/12.
 */
public class WinnerState implements State {
    private GumballMachine gumballMachine ;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert quarter");
    }

    @Override
    public void ejectQuareter() {
        System.out.println("You can't eject quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can't turn crank");
    }

    @Override
    public void dispense() {
        System.out.println("You're a WINNER! You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else{
            gumballMachine.releaseBall();
            if(gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }else{
                System.out.println("Oops,out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
