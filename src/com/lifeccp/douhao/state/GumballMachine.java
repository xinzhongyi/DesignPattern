package com.lifeccp.douhao.state;

/**
 * Created by Administrator on 2018/7/12.
 */
public class GumballMachine {
    State soldOutState ;
    State noQuarterState ;
    State hasQuarterState ;
    State soldState ;
    State winnerState ;

    State state = soldOutState ;
    int count = 0 ;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this) ;
        noQuarterState = new NoQuarterState(this) ;
        hasQuarterState = new HasQuarterState(this) ;
        soldState = new SoldState(this) ;
        winnerState = new WinnerState(this) ;
        this.count = numberGumballs ;
        if(numberGumballs > 0){
            state = noQuarterState ;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuareter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the solt...");
        if(count != 0){
            count = count - 1 ;
        }
    }
}
