package Arrays;

public class butterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=  row; col++) {
                System.out.print("* ");
            }
            int spaces = 2*(n-row);
            for (int col = 1; col <= spaces; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
		
        for (int row = n-1; row >= 1; row--) {
            for (int col = 1; col <=  row; col++) {
                System.out.print("* ");
            }
            int spaces = 2*(n-row);
            for (int col = 1; col <= spaces; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
	}

}
