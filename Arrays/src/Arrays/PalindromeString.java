package Arrays;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse)) 
			System.out.println("Palindrome String!!!");
		
		else 
			System.out.println("Not a Palindrome String!!!");
		
	}

}
