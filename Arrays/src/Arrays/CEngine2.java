package Arrays;

public class CEngine2 {
	
	String company;
	int cc;
	
	Car c3=new Car("Nexon",1400000);			//Early Binding
	Car c4=new Car("Altroz",1200000);
	
	public CEngine2(String company,int cc) {
		this.company=company;
		this.cc=cc;
		
	}
	void display() {
		System.out.println("Engine 2 Created");
		System.out.println();
		System.out.println("Engine 2 brand :"+company);
		System.out.println("Engine 2 CC :"+cc);
		System.out.println("*********************");
	}

}
