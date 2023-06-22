import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double breadth,length;

        // Input for the breadth of the rectangle
        do {
            System.out.print("Enter the breadth of the rectangle: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
            breadth = scanner.nextDouble();
        } while (breadth <= 0);

        // Input for thelength of the rectangle
        do {
            System.out.print("Enter thelength of the rectangle: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
           length = scanner.nextDouble();
        } while (length <= 0);

        // Calculate area, perimeter, and diagonal breadth
        double area = breadth *length;
        double perimeter = 2 * (breadth +length);
        double diagonal = Math.sqrt(breadth * breadth +length *length);

        // Output the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("breadth of the diagonal: " + diagonal);

        scanner.close();
    }
}
