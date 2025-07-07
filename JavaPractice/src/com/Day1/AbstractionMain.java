package com.Day1;
import java.util.*;
abstract class Banking{
	static int pass=1234;
	double balance=10000;
	abstract void checkUser(int pass);
	abstract void withdraw(int amount);
	abstract void deposit(int amount);
	abstract void checkBalance();
}


  class AbstractionMain extends Banking{
	  
	  @Override
		void checkUser(int pass) {
			 if(pass==1234) {
				 System.out.println("Valid User!!!");
			 }
			 else {
				 System.out.println("Invalid User!!!");
				 System.exit(0);
			 }
			
		}

		@Override
		void withdraw(int amount) {
			// TODO Auto-generated method stub
			balance=balance-amount;
			System.out.println(amount+" rs. is withdraw!!");
			System.out.println("Updated Balance ="+balance);
		}

		@Override
		void deposit(int amount) {
			// TODO Auto-generated method stub
			balance=balance+amount;
			System.out.println(amount+" rs. is deposited!!");
			System.out.println("Updated Balance ="+balance);
		}

		@Override
		void checkBalance() {
			// TODO Auto-generated method stub
			System.out.println("Current Balance = "+balance);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionMain m=new AbstractionMain();
		Scanner sc=new Scanner(System.in);
		
		for(;;) {
			System.out.println("1.checkUser /n2.withdraw /n3.deposit /n4.checkBalance /n5.Exit");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter the password : ");
				int pwd=sc.nextInt();
				m.checkUser(pwd);
				break;
				
			case 2:
				System.out.println("Enter the amount you want to withdraw : ");
				int amount=sc.nextInt();
				m.withdraw(amount);	
				break;
				
			case 3:
				System.out.println("Enter the amount you want to deposit : ");
				int amount1=sc.nextInt();
				m.deposit(amount1);		
				break;
				
			case 4:
				m.checkBalance();	
				break;
				
			case 5:
				System.out.println("Plz enter valid choice!");
			}
		}
	}

}
