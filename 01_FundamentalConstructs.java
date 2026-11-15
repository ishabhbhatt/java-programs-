import java.util.Scanner;

public class FundamentalConstructs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\nBasic Operations");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));

        if (b != 0) {
            System.out.println("Division: " + ((double) a / b));
        } else {
            System.out.println("Division is not possible because the second number is zero.");
        }

        System.out.println("\nChecking the first number");
        if (a > 0) {
            System.out.println(a + " is positive.");
        } else if (a < 0) {
            System.out.println(a + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        System.out.println("\nNumbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nEven numbers from 1 to 10:");
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        sc.close();
    }
}
