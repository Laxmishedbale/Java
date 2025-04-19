//Write a Java program to copy elements from one array to another.

public class CopyArray {
    public static void main(final String[] args) {
        
        final int[] array = {10, 20, 30, 40, 50};

        // Create a new array with the same length
        final int[] copiedArray = new int[array.length];

        // Copying elements one by one
        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }

        // Display the copied array
        System.out.println("Original Array: ");
        for (final int value : array) {
            System.out.print(value + " ");
        }

        System.out.println("\nCopied Array: ");
        for (final int value : copiedArray) {
            System.out.print(value + " ");
        }
    }
    
}

    