package Arrays;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int n=5;
//			for(int i=1;i<=n;i++) {				//Outer loop
//				for(int j=1;j<=n-i;j++) {		//Inner loop for print spaces
//					System.out.print(" ");
//				}
//				for(int k=1;k<=(2*i-1);k++) {   //Inner loop to print stars
//					System.out.print("*");
//				}
//				System.out.println();
//			}
		
//		for(int i=1;i<=n;i++) {				//Outer loop
//			char ch='A';
//			for(int j=1;j<=n-i;j++) {		//Inner loop for print spaces
//				System.out.print("  ");
//			}
//			for(int k=1;k<=(2*i-1);k++) {   //Inner loop to print stars
//				System.out.print(ch+" ");
//				ch++;
//			}
//			System.out.println();
//		}
//		
//		int rows=5;
//		for(int i=1;i<=rows;i++) {				//Outer loop
//			for(int j=1;j<=rows-i;j++) {		//Inner loop for print spaces
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i*2-1;j++) {   		//Inner loop to print stars
//				System.out.print("*");
//			}
//			System.out.println();
//		}
////		 
//		for(int i=rows-1;i>=1;i--) {				//Outer loop
//			for(int j=1;j<=rows-i;j++) {		//Inner loop for print spaces
//				System.out.print(" ");
//			}
//			for(int o=1;o<=i*2-1;o++) {   		//Inner loop to print stars
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		int rows=5;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			for (int j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=rows-1;i>=1;i--) {
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
