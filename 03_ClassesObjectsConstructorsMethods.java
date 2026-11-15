import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    String getResult() {
        if (marks >= 40) {
            return "Pass";
        }
        return "Fail";
    }
}

public class ClassesObjectsConstructorsMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        Student student = new Student(name, rollNumber, marks);
        student.displayDetails();
        System.out.println("Result: " + student.getResult());

        sc.close();
    }
}
