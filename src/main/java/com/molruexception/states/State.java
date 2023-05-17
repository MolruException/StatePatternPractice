package com.molruexception.states;

public interface State {
 
	void insertQuarter();

	void ejectQuarter();

	void turnCrank();

	void dispense();

	void refill(int gumballs);

}