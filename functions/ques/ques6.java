
public class ques6 {
    // W6rite a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.println("Enter the radius of the circle:");
    double radius = input.nextDouble();

    circumferenceArea(radius);
}
static void circumferenceArea(double radius){
    double circumference = 2 * Math.PI * radius;
    double area = Math.PI * radius * radius;

    System.out.println("The circumference is: " + circumference);
    System.out.println("The area is: " + area);
}
}