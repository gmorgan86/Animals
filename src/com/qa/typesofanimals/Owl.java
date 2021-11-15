package com.qa.typesofanimals;

public class Owl extends Animal {

	private int wingspan = 30;

	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

	public Owl(int wingspan) {
		
		this.wingspan = wingspan;
	}

	public Owl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Owl [wingspan=" + wingspan + ", Noise=" + getNoise() + ", Color=" + getColor()
				+ ", Legs=" + getLegs() + "]";
	}

	

    
	
}
