public class PrimeNumber 
{
 public static void main(String[ ] args) 
  {
    int num = 17;  
    int count = 0;
    int i = 1;
 
    while (i <= num) {

                 if (num % i == 0) {
                 count = count + 1;
             }
             i = i + 1;
         }
 
         if (count == 2) {
             System.out.println(num + " is a prime number.");
         } else {
             System.out.println(num + " is not a prime number.");
         }
     }
 }