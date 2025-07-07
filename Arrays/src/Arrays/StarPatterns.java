package Arrays;

public class StarPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=5;j++) {
																	//Rectangle
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int n=4;
		int m=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				 
				if(i==1 || i==n || j==1 || j==m) {				//Hollow Rectangle
					System.out.print("*");
				}
				else {
					System.out.print(" ");
					}
			
		}
			System.out.println();
		}
		
		System.out.println();
		
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");							//Half Pyramid
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
		
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");							//Inverted Half Pyramid
			}
			System.out.println();
		}
		
		System.out.println();
		
		int number=4;
		
		for(int i=1;i<=number;i++) {
			//inner loop -> Spaces
			for(int j=1 ;j<=number-i;j++) {
				System.out.print(" ");
			}
			//inner loop -> Star								//Inverted Half Pyramid (180 degree rotate)
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int no=5;
		
		 for(int i=1;i<=no;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print(j+" ");						//Half Pyramid with Numbers
			 }
			 System.out.println();
		 }
		
		 System.out.println();
		 
		int num=5;
		
		 for(int i=1;i<=num;i++) {
			 for(int j=1;j<=num-i+1;j++) {
				 System.out.print(j+" ");						 //Inverted Half Pyramid with Numbers
			 }
			 System.out.println();
		 }
		 
		 System.out.println();
		
		int n1=5;
		int numb=1;
		
		 for(int i=1;i<=n1;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print(numb+" ");	
				 numb++;									//Floyd Triangle
			 }
			 System.out.println();
		 }
		 System.out.println();
		 
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n-i;j++) {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=2*i-1;k++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 for(int i=n-1;i>=1;i--) {
			 for(int j=1;j<=n-i;j++) {
			 System.out.print(" ");						//Pyramid & inverted pyramid
			 }
			 for(int k=1;k<=2*i-1;k++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
		 
		 
		}

	}
