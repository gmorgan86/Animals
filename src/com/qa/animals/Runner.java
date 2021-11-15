package com.qa.animals;

import com.qa.typesofanimals.Bird;
import com.qa.typesofanimals.Dog;
import com.qa.typesofanimals.Owl;
import com.qa.typesofanimals.Tiger;

public class Runner {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Bird bird = new Bird();
		Tiger tiger =new Tiger();
		Owl owl = new Owl();
		
		System.out.println(tiger.isEndangered());
		
		tiger.setColor("Yellow");
		tiger.setNoise("Rawr");
		tiger.setLegs(4);
		dog.setLegs(4);
		dog.setNoise("Woof");
		dog.setColor("Brown");
		bird.setColor("Blue");
		bird.setNoise("Tweet");
		bird.setLegs(2);
		owl.setColor("Brown");
		owl.setNoise("Hoot");
		owl.setLegs(2);
		
		System.out.println(tiger);
		System.out.println(dog);
		System.out.println(owl);
		System.out.println(bird);

		
		
}
}
