package org.tnsif.capgemimi.c2tc.oops;

class Animal
{
	String name = "Animal";
	
	void eat()
	{
		System.out.println(name +" is eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}
public class singlelevl_inhertance { 
	
	public static void main(String [] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.bark();
		
	}
}




