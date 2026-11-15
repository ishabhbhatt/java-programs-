import java.util.Scanner;

interface Printable {
    void printDetails();
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person implements Printable {
    int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    public void printDetails() {
        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll number: " + rollNumber);
    }
}

public class InheritanceAndInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();

        Student student = new Student(name, age, rollNumber);
        student.printDetails();

        sc.close();
    }
}
