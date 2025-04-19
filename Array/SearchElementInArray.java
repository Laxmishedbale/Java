//Write a Java program that searches for a specific element in an array and prints its index.

import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the array
        int[] array = {25, 50, 75, 100, 125, 150};

        // Ask the user for the element to search
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        // Search for the element
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("Element " + key + " found at index " + i);
                found = true;
                break; // Exit the loop once the element is found
            }
        }

        if (!found) {
            System.out.println("Element " + key + " not found in the array.");
        }

        scanner.close();
    }
}
