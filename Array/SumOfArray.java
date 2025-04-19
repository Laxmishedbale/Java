//Write a Java program that calculates and prints the sum of all elements in an integer array.

public class SumOfArray {
    public static void main(String[] args) {
        
        //Creating an array with some numbers
        int[] numbers = {11, 22, 33, 44, 55};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];  
        }

        // Printing the sum of an Array
        System.out.println("The sum of the array elements is: " + sum);
    }
}