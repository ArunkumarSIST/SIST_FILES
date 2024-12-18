package org.tnsif.capgemimi.c2tc.oops;


class Animal3
{
	void eat() 
	{
		System.out.println("Animal is eating");
	}
}
class Dog3 extends Animal3
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}
class Cat3 extends Animal3
{
	void meow()
	{
		System.out.println("Cat is meowing");
	}
}
class Elephant3 extends Animal3
{
	void trumpet()
	{
		System.out.println("Elephant is trumpeting");
	}
}
public class hierarchical_inhertance {

	public static void main(String[] args) {
		Dog3 dog =new Dog3();
		Cat3 cat=new Cat3();
		Elephant3 ele = new Elephant3();
		dog.eat();
		cat.eat();
		ele.eat();
		
		dog.bark();
		cat.meow();
		ele.trumpet();
		

	}

}
