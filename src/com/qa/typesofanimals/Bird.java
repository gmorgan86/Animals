package com.qa.typesofanimals;

public class Bird extends Animal{

	    private int eggcount = 0;

		public int getEggcount() {
			return eggcount;
		}

		public void setEggcount(int eggcount) {
			this.eggcount = eggcount;
		}

		public Bird(int eggcount) {
			this.eggcount = eggcount;
		}

		public Bird() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Bird [eggcount=" + eggcount + ", Noise=" + getNoise() + ", Color=" + getColor()
					+ ", Legs=" + getLegs() + "]";
		}

		
	    
	    
	  
}
