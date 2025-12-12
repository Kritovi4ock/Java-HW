import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileExample {
    public static void main(String[] args) {
        // Создаем текстовый файл для чтения
        try (java.io.FileWriter writer = new java.io.FileWriter("data.txt")) {
            writer.write("John 25 85.5\n");
            writer.write("Alice 30 92.0\n");
            writer.write("Bob 22 78.5\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Пример чтения данных из текстового файла с помощью Scanner
        try (Scanner scanner = new Scanner(new File("data.txt"))) {
            System.out.println("Reading data from file:");
            
            // Чтение файла построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println("Line: " + line);
                
                // Разбор строки на отдельные данные
                Scanner lineScanner = new Scanner(line);
                String name = lineScanner.next();
                int age = lineScanner.nextInt();
                double score = lineScanner.nextDouble();
                
                System.out.printf("  Name: %s, Age: %d, Score: %.1f%n", 
                                 name, age, score);
                lineScanner.close();
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}