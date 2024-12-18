package org.tnsif.capgemini.c2tc.constructor;
class Myclass2
{
	String Colour;
	int cost;
	String Brand;
	
	//Parameterized constructor
	Myclass2(String Colour,int cost,String Brand)
	{
		this.Colour=Colour;
		this.cost = cost;
		this.Brand=Brand;
	}
}
public class Parameterized_constructor {
	public static void main(String[] args) {
		Myclass2 obj= new Myclass2("black",879000,"range rover");
		Myclass2 obj1=new Myclass2("grey",234567,"mustang");
		System.out.println(obj.Colour +" " + obj.cost +" " +obj.Brand);
		System.out.println(obj1.Colour +" " + obj1.cost +" " +obj1.Brand);
		

	}

}




