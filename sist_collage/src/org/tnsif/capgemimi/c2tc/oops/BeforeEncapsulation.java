package org.tnsif.capgemimi.c2tc.oops;

class Human
{
	int age;
	String name;
}
public class BeforeEncapsulation {
	public static void main(String[]  args) {
		Human obj=new Human();
		obj.age=25;
		obj.name="Arun";
		obj.age=67;
		obj.name="sanjana";
		System.out.println("Age is " +obj.age);
		System.out.println("Nmae is " +obj.name);
	}
}
