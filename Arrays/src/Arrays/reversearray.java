
package Arrays;
public class reversearray {

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6, 8, 2, 9};

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
        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }
}
