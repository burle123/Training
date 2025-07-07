package Arrays;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for(int line=1;line<=5;line++) {
//			for(int star=1;star<=5-line+1;star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	
//	for(int i=1;i<=7;i++) {
//		for(int j=1;j<=20;j++) {
//			System.out.print(" * ");
//		}
//		System.out.println();
//	}
		 
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=10;j++) {
//				if(i==1 || i==5 || j==1 || j==10) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}	
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		
		
		int n1=5;
		for(int i=n1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			char ch='A';
//			for(int j=1;j<=i;j++) {
//				System.out.print(ch+" ");
//				ch++;
//			}
//			System.out.println();
//		}
		
//		int n=5;
//		for(int i=n;i>=1;i--) {
//			char ch='A';
//			for(int j=1;j<=i;j++) {
//				System.out.print(ch+" ");
//				ch++;
//			}
//			System.out.println();
//		}
		
		int n=5;
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");				//+ch+ for ASCII Value
				ch++;
			}
			System.out.println();
		}
		
		
		}
	}

