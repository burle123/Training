package com.String;

public class StringComparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="SHANTANU";
		String s2="Shantanu";
		String s3="BURLE";
		String s4="BURLE";
		
		System.out.println("case 1:"+(s1==s2));//false
		System.out.println("case 2:"+(s3==s4));//true
		System.out.println("case 3:"+(s3.equals(s2)));//false
		System.out.println("case 4:"+(s3.compareTo(s4)));//0
		System.out.println("case 5:"+(s1.compareToIgnoreCase(s2)));//0
	}

}
