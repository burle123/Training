package com.Day1;

  class Animal
  {
	void display1() {
	String name="Tiger";
		System.out.println("Animal Name :" +name);
	}
	
}

  class Dog extends Animal{
	String dname="Bruno";
	void display() {
		String name="Tiger";
			System.out.println("Dog Name :" +dname);
		}
}


public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.display1();
		d.display();
	}

}
