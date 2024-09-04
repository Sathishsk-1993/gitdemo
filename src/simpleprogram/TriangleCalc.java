package simpleprogram;

import java.util.Scanner;

public class TriangleCalc {

    private double side1;
    private double side2;
    private double side3;

 
    public TriangleCalc() {
        this(1.0, 1.0, 1.0);
    }

   
    public TriangleCalc(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

   
    public void inputSides() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        this.side1 = scanner.nextDouble();
        System.out.print("Enter side 2: ");
        this.side2 = scanner.nextDouble();
        System.out.print("Enter side 3: ");
        this.side3 = scanner.nextDouble();
    }

    // Check triangle type
    public String getType() {
        if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    // Calc
    public double getArea() {
        String type = getType();
        double area;
        double s = (side1 + side2 + side3) / 2.0;
        switch (type) {
            case "Equilateral":
                area = Math.sqrt(3) / 4 * Math.pow(side1, 2);
                break;
            case "Isosceles":
                if (side1 == side2) {
                    area = 0.5 * side3 * Math.sqrt(Math.pow(side1, 2) - Math.pow(side3 / 2, 2));
                } else if (side2 == side3) {
                    area = 0.5 * side1 * Math.sqrt(Math.pow(side2, 2) - Math.pow(side1 / 2, 2));
                } else {
                    area = 0.5 * side2 * Math.sqrt(Math.pow(side1, 2) - Math.pow(side2 / 2, 2));
                }
                break;
            case "Scalene":
                area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
                break;
            default:
                throw new IllegalArgumentException("Invalid Triangle");
        }
        return area;
    }

    // Display triangle details
    public void displayDetails() {
        System.out.println("Side 1: " + side1);
        System.out.println("Side 2: " + side2);
        System.out.println("Side 3: " + side3);
        System.out.println("Type: " + getType());
        System.out.println("Area: " + getArea());
    }

    public static void main(String[] args) {
        // Create Triangle object using different constructors
        TriangleCalc triangle = new TriangleCalc();
        triangle.inputSides();

        // Display details for each object
        System.out.println("Triangle:");
        triangle.displayDetails();
    }
}

