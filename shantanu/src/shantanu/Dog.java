package shantanu;

public class Dog {
	String name;
	void bark() 	//non-static method (instance method)
	{
		System.out.println(name+" says Woof!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		d1.name="Brunoo";
		d1.bark();

		Dog d2=new Dog();
		d2.name="Lunna";
		d2.bark();
	}

}

