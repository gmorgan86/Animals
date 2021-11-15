package com.qa.typesofanimals;

public class Tiger extends Animal{

	private boolean endangered = true;

	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

	public Tiger(String noise, String color, int legs, boolean endangered) {
		super(noise, color, legs);
		this.endangered = endangered;
	}

	public Tiger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tiger(String noise, String color, int legs) {
		super(noise, color, legs);
	}

	@Override
	public String toString() {
		return "Tiger [endangered=" + endangered + ", Noise=" + getNoise() + ", Color" + getColor()
				+ ", Legs=" + getLegs() + "]";
	}

	
	}

	

	
	
	
	

	
	
