package Arrays;

public class hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int i=rows;i>=1;i--) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			for (int j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=2;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			for (int j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
