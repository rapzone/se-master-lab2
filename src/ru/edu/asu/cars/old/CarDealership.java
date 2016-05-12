package ru.edu.asu.cars.old;

import java.util.ArrayList;


public class CarDealership {
	private ArrayList<SalableVehicle> carLot;  
	private String name; 

	public CarDealership() {
		carLot = new ArrayList<SalableVehicle>();
		name = null;
	}

	public CarDealership(String name) {
		carLot = new ArrayList<SalableVehicle>();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addCar(SalableVehicle c) {
		carLot.add(c);
	}

	public void showCars() {
		System.out.println("Автосалон " + name + ", в наличии:");
		for (SalableVehicle c : carLot) {
			System.out.println(c);
		}
	}

        public SalableVehicle findCar(String vin) throws NoSuchCarException {
 	    for (SalableVehicle c : carLot) {
	        if (c.getVin().equals(vin)) {
                    return c;
                }
	    }
            throw new NoSuchCarException("Ошибка: нет автомобиля с таким VIN");
        }

        public void sellCar(String vin) throws NoSuchCarException {
 	    for (SalableVehicle c : carLot) {
	        if (c.getVin().equals(vin)) {
                    carLot.remove(c);
                    return;
                }
	    }
 	    	throw new NoSuchCarException("Ошибка: нет автомобиля с таким VIN");
        }

	public static void main(String argv[]) throws NoSuchCarException {

	}
}
