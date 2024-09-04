package simpleprogram;

import java.util.Scanner;

public class Studentmarks {
    static int enrollmentNumber;
    static  String studentName;
    static  char gender;
    static  int m1, m2, m3;
    static  int total;
    static  double average;
    static  String result;

    static int passResult = 0;
     static int failResult = 0;
   
    public void userinput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student Enrollment Number  :");
        enrollmentNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter Student Name:");
        studentName = scanner.nextLine();
        System.out.println("Enter Gender (M/F):");
        gender = scanner.next().charAt(0);
        System.out.println("Enter Marks in mark 1:");
        m1 = scanner.nextInt();
        System.out.println("Enter Marks in mark 2:");
        m2 = scanner.nextInt();
        System.out.println("Enter Marks in mark 3:");
        m3 = scanner.nextInt();
    }
  
    public void calculateResult() {
        total = m1 + m2 + m3;
        average = total / 3.0;

        if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
            result = "pass";
            passResult++;
        } else {
            result = "fail";
            failResult++;
        }
    }
    
    public void display() {
        System.out.println("Enrollment Number: " + enrollmentNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println("Gender: " + gender);
        System.out.println("Marks 1 : " + m1);
        System.out.println("Marks 2: " + m2);
        System.out.println("Marks 3: " + m3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Result: " + result);
        System.out.println("-----------------------------");
    }

  
    public static void resultCountDisplay() {
        System.out.println("Pass Result Count: " + passResult);
        System.out.println("Fail Result Count: " + failResult);
    }


    public static void main(String[] args) {
      
    	Studentmarks[] students = new Studentmarks[4];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Studentmarks();
            students[i].userinput();
            students[i].calculateResult();
        }

        for (Studentmarks student : students) {
            student.display();
        }

        Studentmarks.resultCountDisplay();
    }
}