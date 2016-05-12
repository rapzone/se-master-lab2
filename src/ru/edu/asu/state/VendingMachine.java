package ru.edu.asu.state;

public class VendingMachine {

	State soldOutState;
	State noCoinState;
	State hasCoinState;
	State soldState;
	State brokenState;

	State state;

	int count = 0;



	public VendingMachine(int count) {
		soldOutState = new SoldOutState(this);
		noCoinState = new NoCoinState(this);
		hasCoinState = new HasCoinState(this);
		soldState = new SoldState(this);
		brokenState = new BrokenState(this);

		this.count = count;
		if (count > 0) {
			state = noCoinState;
		} else {
			state = soldOutState;
		}
	}

	public void insertCoin() {
		state.insertQuarter();
	}

	public void ejectCoin() {
		state.ejectQuarter();
	}


	public void pushSelectButton() {
		state.pushSelectButton();
		state.dispense();

	}

	public void giveGood() {
		System.out.println("Товар выдается...");
		if (count != 0) {
			count = count - 1;
		}
	}

	public void dispense() {
		soldState.dispense();
		soldOutState.dispense();
		noCoinState.dispense();
		soldOutState.dispense();
		hasCoinState.dispense();
	}

	public void refill(int numOfProducts) {
		this.count = numOfProducts;
		state.refill();
	}

	public String toString() {


		StringBuffer result = new StringBuffer();
		result.append("\nТоварный автомат ");
		result.append("\nВ наличии: " + count + " товаров");
		result.append("\nСостояние: ");
		if (count != 1) {
			result.append(state);
		}
		result.append("\n");
		return result.toString();
	}

	public State getState() {
		return state;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getNoCoinState() {
		return noCoinState;
	}

	public void setNoCoinState(State noCoinState) {
		this.noCoinState = noCoinState;
	}

	public State getHasCoinState() {
		return hasCoinState;
	}

	public void setHasCoinState(State hasCoinState) {
		this.hasCoinState = hasCoinState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public State getBrokenState() {
		return brokenState;
	}

	public void setBrokenState(State brokenState) {
		this.brokenState = brokenState;
	}

	//------------------------------------------------------------------------------
	/*final static int SOLD_OUT = 0;
	final static int NO_COIN = 1;
	final static int HAS_COIN = 2;
	final static int SOLD = 3;
 
	int state = SOLD_OUT;
	int count = 0;
  
	public VendingMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_COIN;
		}
	}
  
	public void insertCoin() {
		if (state == HAS_COIN) {
			System.out.println("Нельзя поместить больше одной монеты");
		} else if (state == NO_COIN) {
			state = HAS_COIN;
			System.out.println("Вы поместили монету");
		} else if (state == SOLD_OUT) {
			System.out.println("Нельзя поместить монету, все товары распроданы");
		} else if (state == SOLD) {
        	System.out.println("Подождите, товар выдается");
		}
	}

	public void ejectCoin() {
		if (state == HAS_COIN) {
			System.out.println("Монета возвращена");
			state = NO_COIN;
		} else if (state == NO_COIN) {
			System.out.println("Вы не поместили монету");
		} else if (state == SOLD) {
			System.out.println("Вы уже выбрали товар, отмена невозможна");
		} else if (state == SOLD_OUT) {
        	System.out.println("Невозможно вернуть, монета еще не помещена");
		}
	}
 

 
 
	public void pushSelectButton() {
		if (state == SOLD) {
			System.out.println("Двойное нажатие");
		} else if (state == NO_COIN) {
			System.out.println("Вы пытаетесь выбрать товар, не поместив монету");
		} else if (state == SOLD_OUT) {
			System.out.println("Выбранные товары отстутсвуют");
		} else if (state == HAS_COIN) {
			System.out.println("Товар выбран...");
			state = SOLD;
			dispense();
		}
	}
 
	public void dispense() {
		if (state == SOLD) {
			System.out.println("Товар выдается...");
			count = count - 1;
			if (count == 0) {
				System.out.println("Товары закончились!");
				state = SOLD_OUT;
			} else {
				state = NO_COIN;
			}
		} else if (state == NO_COIN) {
			System.out.println("Сперва необходимо произвести оплату");
		} else if (state == SOLD_OUT) {
			System.out.println("Товар не выдан");
		} else if (state == HAS_COIN) {
			System.out.println("Товар не выдан");
		}
	}
 
	public void refill(int numOfProducts) {
		this.count = numOfProducts;
		state = NO_COIN;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nТоварный автомат");
		result.append("\nВ наличии: " + count + " товаров");
		result.append("\nСостояние: ");
		if (state == SOLD_OUT) {
			result.append("товары распроданы");
		} else if (state == NO_COIN) {
			result.append("ожидание монеты");
		} else if (state == HAS_COIN) {
			result.append("ожидание выбора товара");
		} else if (state == SOLD) {
			result.append("товар выдается");
		}
		result.append("\n");
		return result.toString();
	}*/
}


