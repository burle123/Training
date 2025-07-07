package com.Day1;

  class Tiger
  {
	void display1() {
	String name="Tiger";
		System.out.println("Animal Name :" +name);
	}
	
}

  class Simbha extends Tiger{
	String dname="Simbha";
	void display2() {
		String name="Tiger";
			System.out.println("Dog Name :" +dname);
		}
}
  class Cat extends Simbha{
	  String cname="Merry";
		void display3() {
			String name="Tiger";
				System.out.println("Cat Name :" +cname);
			}
  }

public class MultipleInheeritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.display1();
		c.display2();
		c.display3();
	}

}
