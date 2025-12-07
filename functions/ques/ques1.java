
import java.util.Scanner;

public class ques1 {
    // 1Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number:");
    int num1 = input.nextInt();
    System.out.println("Enter second number:");
    int num2 = input.nextInt();
    System.out.println("Enter third number:");
    int num3 = input.nextInt();
   
    int max = findMax(num1, num2, num3);
    int min = findMin(  num1, num2, num3);

    System.out.println("Maximum number is: " + max);
    System.out.println("Minimum number is: " + min);

}


 static int findMax(int num1, int num2 , int num3 ) {

    int max = num1;
    if (num2 > max) {
        max = num2;
    }
    if (num3 > max) {
        max = num3;
    }
 
    return max;
}

 static int findMin(int num1, int num2 , int num3 ) {
    int min = num1;
    if (num2 < min) {
        min = num2;
    }
    if (num3 < min) {
        min = num3;
    }
 
    return min;
}
}