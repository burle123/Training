package com.String;

public class StringOpeartions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
				String s1 = new String (" Indian ");
				
				System.out.println(s1);
				String s2=s1.toUpperCase();
				System.out.println(s2);
				int a=s2.length();
				System.out.println(a);
				String s3=s1.substring(1, 7);
				System.out.println(s3);
				
				System.out.println(s1.trim());
				System.out.println(s1.stripTrailing());
				System.out.println(s1.isEmpty());
				
				//string comparison
				s2=new String(s1);
				
				//== --> object reference
				//equals --> data
				
				System.out.println("case 1 :"+ s1.equals(s2));//true
				System.out.println("case 2 :"+ s1==s2);//false
				

			}

		
	}


