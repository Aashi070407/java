
import java.util.Scanner;



public class ques4 {
    // 4Write a program to print the sum of two numbers entered by user by defining your own method.
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number:");
    int num1 = input.nextInt();
    System.out.println("Enter second number:");

    int num2 = input.nextInt();

    sum( num1 , num2);

}

static void sum(int num1 , int num2){
    int sum = num1 + num2;
    System.out.println("The sum is: " + sum);
}
}
