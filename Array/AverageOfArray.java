//Create a Java program that finds and prints the average of values in a double array.

public class AverageOfArray {
    public static void main(String[] args) {

        // Creating a double array with some values
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
       
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculating the average
        double average = sum / numbers.length;

        // Printing the average
        System.out.println("The average of the array values is: " + average);
    }
}
