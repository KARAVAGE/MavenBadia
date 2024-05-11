package badia;

import java.util.Scanner;

/**
 * Represents a rectangle and provides methods to calculate its perimeter and area.
 */
public class App {
    private double length;
    private double width;

    /**
     * Constructs a rectangle object with the given length and width.
     * 
     * @param length The length of the rectangle.
     * @param width  The width of the rectangle.
     */
    public App(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Calculates the perimeter of the rectangle.
     * 
     * @return The perimeter of the rectangle.
     */
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    /**
     * Calculates the area of the rectangle.
     * 
     * @return The area of the rectangle.
     */
    public double calculateArea() {
        return length * width;
    }

    /**
     * Prompts the user to enter the length and width of the rectangle and returns a
     * new App object with the provided dimensions.
     * 
     * @return A new App object representing the rectangle with user-provided
     *         dimensions.
     */
    public static App getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        scanner.close();

        return new App(length, width);
    }

    /**
     * Calculates and displays the perimeter and area of the rectangle.
     */
    public void displayPerimeterAndArea() {
        double perimeter = calculatePerimeter();
        double area = calculateArea();

        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Area of the rectangle: " + area);
    }

    /**
     * Main method to run the application.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        App rectangle = getUserInput();
        rectangle.displayPerimeterAndArea();
    }
}
