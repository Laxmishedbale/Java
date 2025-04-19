//Write a Java program to print the reverses of an array.

public class ReverseArray {
    public static void main(String args[]){

        //creating an array
        int[] arr = {1, 2, 3, 4, 5, 6,};

        //Printing the reversed array
        System.out.println("Reversed array:");
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
    
}
