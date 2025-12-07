

import java.util.Scanner;



public class ques2 {
// Subtract the Product and Sum of Digits of an Integer



public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number 2 or more digits: ");
    int a = sc.nextInt();
    int SumDigits = 0;
    int ProductDigits = 1;
    while (a > 0) {
        int digit = a % 10;
        SumDigits += digit;
        ProductDigits *= digit;
        a = a / 10;
    }
   

    System.out.println("The difference between product and sum of digits is: " + (ProductDigits - SumDigits));
    

}
}
