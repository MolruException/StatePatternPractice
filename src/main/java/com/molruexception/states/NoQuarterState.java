package com.molruexception.states;

import com.molruexception.machines.GumballMachine;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	}

	@Override
	public void refill(int gumballs) {
		System.out.printf("you can't refill gumballs in %s\n", this.getClass().getSimpleName());
	}

	public String toString() {
		return "waiting for quarter";
	}
}