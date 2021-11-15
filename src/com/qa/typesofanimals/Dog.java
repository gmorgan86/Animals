package com.qa.typesofanimals;

public class Dog extends Animal {

	private boolean lick = true;

	public boolean isLick() {
		return lick;
	}

	public void setLick(boolean lick) {
		this.lick = lick;
	}

	public Dog(boolean lick) {
	
		this.lick = lick;
	}

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dog [lick=" + lick + ", Noise=" + getNoise() + ", Color=" + getColor() + ", Legs="
				+ getLegs() + "]";
	}

	
	
	
	
	
}
