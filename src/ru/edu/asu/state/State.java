package ru.edu.asu.state;

interface State {

	void insertQuarter();

	void ejectQuarter();

	void dispense();

	void pushSelectButton();

	void refill();

	/*void insertQuarter(VendingMachine machine);

	void ejectQuarter(VendingMachine gumballMachine);

	void dispense(VendingMachine gumballMachine);*/


}
