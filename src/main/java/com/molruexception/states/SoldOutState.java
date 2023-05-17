package com.molruexception.states;

import com.molruexception.machines.GumballMachine;

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}
 
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}
 
	public void dispense() {
		System.out.println("Oops, out of gumballs!");
	}

	@Override
	public void refill(int gumballs) {
		gumballMachine.setCount(gumballs);
		System.out.printf("%d gumballs are refilled \n", gumballs);

		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	public String toString() {
		return "sold out";
	}
}