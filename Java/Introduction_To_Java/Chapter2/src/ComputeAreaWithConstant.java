import java.util.Scanner;
public class ComputeAreaWithConstant {
    public static void main(String[] args){
        final double PI = 3.14159; // Declares a constant

        // Create a Scanner object
        Scanner scan = new Scanner(System.in);

        // Prompts the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = scan.nextDouble();

        // Compute area
        double area = radius * radius * PI;

        // Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
