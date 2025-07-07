package Arrays;

public class CEngine1 {
	
	String company;
	int cc;
	
	Car c1=new Car("Fronx",1000000);			//Early Binding
	Car c2=new Car("Swift",1200000);
	
	public CEngine1(String company,int cc) {
		this.company=company;
		this.cc=cc;
		
	}
	void display() {
		System.out.println("Engine 1 Created");
		System.out.println();
		System.out.println("Engine brand :"+company);
		System.out.println("Engine CC :"+cc);
		System.out.println("***********************");
	}

}
