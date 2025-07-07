package Arrays;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeEncap s=new EmployeeEncap();
		s.setName("SB");
		s.setId(19);
		s.setSal(50000);
		
		System.out.println("Emp Name : "+s.getName());
		System.out.println("Emp id : "+s.getId());
		System.out.println("Emp Salary : "+s.getSalary());
	}

}
