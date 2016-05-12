package ru.edu.asu.cars;

import java.util.Scanner;

public final class Car
{
    private String make;
    private String model;
    private String color;
    private int year;


    public Car()
    {

    }

    public Car(String make, String model, String color, int year) {
    	this.make = make;
    	this.model = model;
    	this.color = color;
    	this.year = year;
    }

    public void set() {
        Scanner sc = new Scanner(System.in);

        System.out.print("�������������: ");
        make = sc.next();
        System.out.print("������: ");
        model = sc.next();
        System.out.print("����: ");
        color = sc.next();
        System.out.print("���: ");
        year = sc.nextInt();
    }

    public void setMake(String mk) {
        make = mk;
    }

    public void setModel(String mod) {
        model = mod;
    }

    public void setColor(String col) {
        color = col;
    }

    public void setYear(int yr) {
        year = yr;
    }

    public String toString() {
        return "����: " + color + " " + make +
                " " + model + " " + year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public boolean equals(Object obj) {
    	if (obj == null) {
    		return false;
    	} else if (obj instanceof Car) {
    		Car other = (Car) obj;
    		return make.equals(other.make) && model.equals(other.model)
     		    && color.equals(other.color) && year == other.year;
    	} else {
    		return false;
    	}

    }

    public static void main(String[] args) {
    	Car focus = new Car();
    	Car civic = new Car("Honds", "Civic", "������", 2010);
    	System.out.println(focus);
    	System.out.println(civic);
    	System.out.println(focus.equals(civic));
    	Car aCar = new Car();
    	aCar.set();
    	System.out.println(aCar);
    }
}
