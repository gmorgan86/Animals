package com.qa.typesofanimals;

public abstract class Animal {

	private String noise;
	private String color;
	private int legs;
	
	public String getNoise() {
		return noise;
	}
	public void setNoise(String noise) {
		this.noise = noise;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public Animal(String noise, String color, int legs) {
		super();
		this.noise = noise;
		this.color = color;
		this.legs = legs;
	}
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	
}
