
import java.util.Scanner;


public class ques2 {
    public static void main(String[] args) {
        // Define a program to find out whether a given number is even or odd.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        evenOdd(number);
      
    }

    static void evenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
