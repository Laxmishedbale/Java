//Create a Java program that finds and prints the maximum value in an array of integers.

public class MaxValue {
    public static void main(String[] args) {

        // Creating an array with some integer values
        int[] numbers = {30, 19, 56, 22, 88, 17, 6};

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // updating max if find a bigger number
            }
        }

        // Printing the maximum value
        System.out.println("The maximum value in the array is: " + max);
    }
}
