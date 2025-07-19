package com.String;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch= {'S','H','A','N','T','A','N','U'};
		
		String str=new String(ch);
		System.out.println(str);
		
		String str1=new String(str);
		str1=str1.toLowerCase();
		System.out.println(str1);
		
		
		//String Concatenation using + operator.
		
		System.out.println("India is my country "+"and all indians are my "+"brothers and sisters.");
	}

}
