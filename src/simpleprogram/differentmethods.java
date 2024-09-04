package simpleprogram;

import java.util.Scanner;

public class differentmethods {
	 double radius;

	    
	    public void radius() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the radius value: ");
	        radius = scanner.nextDouble();
	    }

	  
	    public void printOutput() {
	        System.out.println("\nOutputs:");
	        System.out.println("Radius: " + radius);
	    }

	    
	    public  void calculation() {
	        double areaOfCircle = 3.14 * radius*radius;
	        double perimeterOfCircle = 2 * 3.14 * radius;
	        double volumeOfSphere = (4.0 / 3.0) * 3.14 *radius*radius*radius; 

	        System.out.println("Area of the Circle: " + areaOfCircle);
	        System.out.println("Perimeter of the Circle: " + perimeterOfCircle);
	        System.out.println("Volume of the Sphere: " + volumeOfSphere);
	    }

	    public static void main(String[] args) {
	      
	    	differentmethods figure = new differentmethods();

	        figure.radius();
	        figure.printOutput();
	        figure.calculation();
	    }
	}


