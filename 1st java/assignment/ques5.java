

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enterr rupees:");
        double rupees = sc.nextDouble();
        double dollar = rupees / 82.74;
        System.out.println("The amount in dollars is: " + dollar);

    }
}
