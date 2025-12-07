
import java.util.Scanner;



// public class ques3 {
//     // Input a number and print all the factors of that number (use loops).

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number to find its factors: ");
//     int a = sc.nextInt();

//     System.out.print("The factors of " + a + " are: ");
//     for (int i = 1; i <= a; i++) {
//         if (a % i == 0) {
//             System.out.print(i + " ");
//         }
//     }
// }
// }


// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

// public class ques3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int sum = 0;
//         int a = sc.nextInt();
//         while (a != 0) {
//             sum += a;
//             a = sc.nextInt();
//         }
//     }


// }

// Take integer inputs till the user enters 0 and print the largest number from all.
// Addition Of Two Numbers

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int a = sc.nextInt();
        while (a != 0) {
            if (a > largest) {
                largest = a;
            }
            a = sc.nextInt();
        }
        System.out.println("The largest number entered is: " + largest);
    }
}