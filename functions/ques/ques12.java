
import java.util.Scanner;



public class ques12 {
    // 12Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
public static void main(String[] args) {
    Scanner  input = new Scanner(System.in); 
    System.out.println("Enter first number:");
    int a = input.nextInt();    
    System.out.println("Enter second number:");
    int b = input.nextInt();

    System.out.println("Enter third number:");
    int c = input.nextInt();
    pythagoreanTriplet(a , b , c);
}
static void pythagoreanTriplet(int a , int b , int c){
    if ( (a*a + b*b) == c*c || (b*b + c*c) == a*a || (c*c + a*a) == b*b ){
        System.out.println("The triplet is a Pythagorean triplet.");
    }
    else{
        System.out.println("The triplet is not a Pythagorean triplet.");
    }
}
}