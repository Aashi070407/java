
import java.util.Scanner;



public class ques13 {
//    13Write a function that returns all prime numbers between two given numbers.
 public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number:");
    int num1 = input.nextInt();

    System.out.println("Enter second number:");
    int num2 = input.nextInt();
  primeNumbers(num1, num2);
    
 }
 static int primeNumbers(int num1 , int num2){
    for (int i = num1; i <= num2; i++) {
        boolean isPrime = true;
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && i > 1) {
            System.out.print(i + " ");
        }
    }
    return 0;
 }
}
