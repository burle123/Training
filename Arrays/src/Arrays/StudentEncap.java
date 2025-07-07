package Arrays;

public class StudentEncap {
	
	private String name;
	private int rollno;
	
	public String getName() {
		return name;
	}
	public int getRoll() {
		return rollno;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setRoll(int rollno) {
		this.rollno=rollno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentEncap s=new StudentEncap();
		s.setName("SB");
		s.setRoll(19);
		
		System.out.println("Name : "+s.getName());
		System.out.println("Roll no : "+s.getRoll());
	}

}
