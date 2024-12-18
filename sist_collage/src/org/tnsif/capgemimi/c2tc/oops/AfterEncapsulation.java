package org.tnsif.capgemimi.c2tc.oops;

class Human1
{
	private int age;
	private String name;

public void setAge(int a)
{
	age=a;
}
public int getAge()
{
	return age;
}
public void setName(String n)
{
	name=n;
}
public String getName()
{
	return name;
}
}

public class AfterEncapsulation {
	
	public static void main(String[] args) {
		Human1 obj= new Human1();
		obj.setAge(24);
		obj.setName("Arun");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());	
		
		obj.setAge(22);
		obj.setName("sushma");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());	
		
	}

}
