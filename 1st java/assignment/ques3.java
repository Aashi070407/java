

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount:");
        double principle = sc.nextDouble();
        System.out.println("Enter the rate of interest:");  
        double rate = sc.nextDouble();
        System.out.println("Enter the time in years:"); 
        double time = sc.nextDouble();
        double simpleInterest = (principle * rate * time) / 100;    
        System.out.println("The Simple Interest is: " + simpleInterest);
        
    }
}
