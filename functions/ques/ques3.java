import java.util.Scanner;

public class ques3 {
    // 3A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age:");
        int number = input.nextInt();
        age(number);
      
    }

    static void age(int number) {
        if (number < 18) {
            System.out.println(number + " is not eligible to vote.");
        } else {
            System.out.println(number + " is eligible to vote.");
        }
}
}