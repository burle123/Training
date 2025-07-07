package shantanu;

public class Bike {
	int speed=0;
	
	void accelerate(int increment) 
	{										//non-static method (instance method)
		speed=speed+increment;
		
		System.out.println("Accelerate speed = "+speed);
	}
	void brake(int decrement) 
	{										//non-static method (instance method)
		speed=speed-decrement;
		
		System.out.println("Break speed = "+speed);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1=new Bike();
		b1.accelerate(10);
		b1.brake(3);
	}

}
