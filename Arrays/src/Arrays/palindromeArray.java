
package Arrays;
public class palindromeArray {

    public static void main(String[] args) {
        int[] arr1 = {1,2,4,5,2,1};

        System.out.println("Original array:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }

        // Reverse the array in-place
        int start = 0;
        int end = arr1.length - 1;

        while (start < end) {
            int temp = arr1[start];
            arr1[start] = arr1[end];
            arr1[end] = temp;
            start++;
            end--;
        }

        System.out.println("\nReversed array:");
        for (int num2 : arr1) {
            System.out.print(num2 + " ");
            
        }
        	if(arr1==) {
        		System.out.println("\nPalindrome!!!");
        	}
        	else {
        		System.out.println("Not a Palindrome!!!");
        	}
    
    }
}
