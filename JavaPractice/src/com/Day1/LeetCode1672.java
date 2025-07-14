package com.Day1;

public class LeetCode1672 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] accounts= {{1,2,3,5},{3,2,1}};
		System.out.println(maxWealth(accounts));
	}
	public static int maxWealth(int[][] accounts) {
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<accounts.length;i++) {
			int sum=0;
			for(int j=0;j<accounts[i].length;j++) {
				sum=sum+accounts[i][j];
			}
			System.out.println(sum);
			if(sum>max) {
				max=sum;
			}
		}
		return max;		
	}
}
