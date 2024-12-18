package org.tnsif.capgemimi.c2tc.oops;

class MethodOverloadingImp
{
	public int add(int a,int b)//2 parameters
	{
		return a+b;
	}
	public int add(int a, int b, int c)//3 parameters
	{
		return a+b+c;
	}
	public double add(int a, double b)
	{
		return a+b;
	}
}
public class Methodoverloading {

	public static void main(String[] args) {
		MethodOverloadingImp obj= new MethodOverloadingImp();
		System.out.println(obj.add(9, 6));
		System.out.println(obj.add(6,7,1));
		System.out.println(obj.add(3,5.6 ));

	}

}
