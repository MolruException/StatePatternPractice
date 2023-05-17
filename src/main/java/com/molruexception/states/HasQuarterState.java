package com.molruexception.states;

import com.molruexception.machines.GumballMachine;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}
 
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

	@Override
	public void refill(int gumballs) {
		System.out.printf("you can't refill gumballs in %s\n", this.getClass().getSimpleName());
	}

	public void dispense() {
        System.out.println("No gumball dispensed");
    }
    
 
	public String toString() {
		return "waiting for turn of crank";
	}
}