import java.util.Arrays;
import java.util.Scanner;

public class ArrayAndStringProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / 5.0));
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        sc.nextLine();
        System.out.print("\nEnter a sentence: ");
        String sentence = sc.nextLine();

        System.out.println("Length: " + sentence.length());
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Lowercase: " + sentence.toLowerCase());
        System.out.println("Reversed: " + new StringBuilder(sentence).reverse());

        sc.close();
    }
}
