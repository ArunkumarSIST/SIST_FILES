package org.tnsif.capgemimi.c2tc.oops;

public class KIA_motors {
	int nocar;
	String model;
	String engine;
	int speed;
	
	void display()
	{
		System.out.println("This is KIIA motors , welcome to our showroom");
	}
	void welcome()
	{
		System.out.println("welcome");
	}
	public static void main(String[] args) {
		KIA_motors obj= new KIA_motors();
		obj.display();
		obj.welcome();
		obj.nocar=1888;
		obj.model="KIA";
		obj.engine="Petrol";
		obj.speed= 80;
		System.out.println(obj.nocar);
		System.out.println(obj.model);
		System.out.println(obj.engine);
		System.out.println(obj.speed);


		
	}

}
