package shantanu;

import java.util.Scanner;  

public class pow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();  

        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();  

        // Calculate the power using Math.pow()
        double result = Math.pow(base, exponent);

        // Print the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close();  
    }
}