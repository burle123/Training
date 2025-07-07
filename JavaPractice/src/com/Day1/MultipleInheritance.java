package com.Day1;

    interface virat {
	void dance();
}
  interface anushka {
	void dance1();
}

  class MultipleInher implements  virat,anushka{
  
	@Override
	public void dance() {
		// TODO Auto-generated method stub
	  {
			System.out.println("Bangda!!!");
		}
	}
	@Override
	public void dance1() {
		// TODO Auto-generated method stub
		System.out.println("Zumba!!!");
	}

  }
class MultipleInheritance extends MultipleInher{
	public static void main(String args[]) {
		MultipleInher m=new MultipleInher();
		m.dance();
		m.dance1();
	}
}
