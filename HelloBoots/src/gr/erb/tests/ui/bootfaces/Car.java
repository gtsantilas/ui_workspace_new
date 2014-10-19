package gr.erb.tests.ui.bootfaces;

import java.io.Serializable;

public class Car implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String id;
	private String brand;
	private int year;
	private int price;
	private String color;
	private Boolean boldState;
	
	public Car(String id, String brand, int year, String Color, int price, Boolean State ) {
		this.id = id;
		this.brand = brand;
		this.year = year;
		this.color = Color;
		this.price = price;
		this.boldState = State;
		
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public Boolean getBoldState() {
		return boldState;
	}


	public void setBoldState(Boolean boldState) {
		this.boldState = boldState;
	}


	
}
