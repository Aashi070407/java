

import java.util.Scanner;

public class ques10 {
    // 10Write a function to find if a number is a palindrome or not. Take number as parameter.
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = input.nextInt();
    palindrome(number);
}
static void palindrome(int number){
    int originalNumber = number;
    int reversedNumber = 0;

    while (number != 0) {
        int digit = number % 10;
        reversedNumber = reversedNumber * 10 + digit;
        number /= 10;
    }

    if (originalNumber == reversedNumber) {
        System.out.println(originalNumber + " is a palindrome.");
    } else {
        System.out.println(originalNumber + " is not a palindrome.");
    }
}
}
