import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "student_notes.txt";

        System.out.println("Enter text to save in the file:");
        String text = sc.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(text);
            writer.newLine();
            writer.write("This line was added by the Java program.");
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Could not write to the file: " + e.getMessage());
        }

        System.out.println("\nReading file content:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Could not read the file: " + e.getMessage());
        }

        sc.close();
    }
}
