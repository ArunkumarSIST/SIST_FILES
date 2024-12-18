package org.tnsif.capgemimi.c2tc.oops;


class Student
{
	private String name;
	private int age;
	private String course;
	private double grade;
	
	//Constructor with no parameters
	public Student()
	{
		this.name = "unknown";
		this.age = 18;
		this.course = "Not Assigned";
		this.grade = 0.0;
	}
	
	//Constructor with one parameter
	public Student(String name)
	{
		this.name = "name";
		this.age = 20;
		this.course = "Not Assigned";
		this.grade = 0.0;
	}
	
	//Constructor with two parameters
	public Student(String name , int age)
	{
		this.name = "name";
		this.age = age ;
		this.course = "Not Assigned";
		this.grade = 0.0;
		
	}
	
	//Constructor with three parameters
	public  Student(String name, int age, String course)
	{
		this.name = "name";
		this.age = age ;
		this.course = "course";
		this.grade = 0.0;
		
	}
	
	// Constructor with  four parameters
	public  Student(String name, int age, String course, double grade)
	{
		this.name = "name";
		this.age = age ;
		this.course = "course";
		this.grade = grade;
		
	}
	public void displayStudentInfo()
	{
		System.out.println("Nmae: " + name);
		System.out.println("Age: " + age);
		System.out.println("Course: " + course);
		System.out.println("Grade: " + grade);
		System.out.println();
	}
	
}
public class constructor_overloadin {

	public static void main(String[] args) {
		Student student1 = new Student(); //default constructor
		Student student2 = new Student(); //constructor with one parameter
		Student student3 = new Student(); //constructor with two parameters
		Student student4 = new Student(); //constructor with three parameters
		Student student5 = new Student(); //constructor with four parameters
		
	
		student1. displayStudentInfo();
		student2. displayStudentInfo();
		student3. displayStudentInfo();
		student4. displayStudentInfo();
		student5. displayStudentInfo();
		

	}

}