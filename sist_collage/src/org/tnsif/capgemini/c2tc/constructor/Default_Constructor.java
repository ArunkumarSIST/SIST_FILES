package org.tnsif.capgemini.c2tc.constructor;
class Myclass1
{
	String Colour;
	int cost;
	String Brand;
	
	//default constructor
	Myclass1()
	{
		Colour="dark black";
		cost = 1500000;
		Brand="Range Rover Defender";
	}
}
public class Default_Constructor {

	public static void main(String[] args) {
		Myclass1 obj= new Myclass1();
		System.out.println(obj.Colour +" " + obj.cost +" " +obj.Brand);
	

	}

}
