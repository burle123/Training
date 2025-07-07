package Arrays;

public class rangingleapyear {
		static public void main(String args[]) {
		System.out.println("Leap years from 2000 to 2015");
		for(int y=2000;y<=2015;y++) {
			if((y%4==0 && y%100!=0)||(y%400==0)) {
				System.out.println(y);
			}
		}
}
}
