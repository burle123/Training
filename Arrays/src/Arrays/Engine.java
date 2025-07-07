package Arrays;

public class Engine {
	String brand;
	int cc;
	Bike b=new Bike("Hornet",100000);			//Early Binding
	
	public Engine(String brand,int cc) {
		this.brand=brand;
		this.cc=cc;
		
	}
	void display() {
		System.out.println("Engine Created");
		System.out.println("Engine brand :"+brand);
		System.out.println("Engine CC :"+cc);
	}

}
