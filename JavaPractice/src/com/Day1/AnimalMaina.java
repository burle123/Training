package com.Day1;
import java.util.*;

// Abstract Animal class
abstract class Animal12 {
    abstract void sound();
    abstract void type();
}

// Dog class
class Dog1 extends Animal12 {
    @Override
    void sound() {
        System.out.println("Dog says: Woof Woof!");
    }

    @Override
    void type() {
        System.out.println("Dog is a domestic animal.");
    }
}

// Cat class
class Cat1 extends Animal12 {
    @Override
    void sound() {
        System.out.println("Cat says: Meow Meow!");
    }

    @Override
    void type() {
        System.out.println("Cat is a domestic animal.");
    }	 
}
 
// Main class with menu
public class AnimalMaina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Animal animal;

        while (true) {
            System.out.println("\nChoose an animal:");
            System.out.println("1. Dog");
            System.out.println("2. Cat");
             
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Dog1 d = new Dog1();
                    d.sound();
                    d.type();
                    break;

                case 2:
                    Cat1 c = new Cat1();
                    c.sound();
                    c.type();
                    break;
                    
				 case 3:
					 System.out.println("Exiting...");
				     System.exit(0);
				     break;
				
				 default:
					 System.out.println("Invalid choice! Please try again.");
				            }
				        }
				    }
				}
