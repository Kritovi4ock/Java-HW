import java.io.*;
import java.sql.*;
import java.util.concurrent.locks.Lock;

public class AutoCloseableExample {
    
    static class MyResource implements AutoCloseable {
        private String name;
        
        public MyResource(String name) {
            this.name = name;
            System.out.println("Resource '" + name + "' created");
        }
        
        public void use() {
            System.out.println("Using resource '" + name + "'");
        }
        
        @Override
        public void close() {
            System.out.println("Resource '" + name + "' closed automatically");
        }
    }
    
    static class DatabaseConnection implements AutoCloseable {
        public DatabaseConnection() {
            System.out.println("Database connection opened");
        }
        
        public void executeQuery(String query) {
            System.out.println("Executing: " + query);
        }
        
        @Override
        public void close() throws SQLException {
            System.out.println("Database connection closed");
            // Может бросать проверяемые исключения
        }
    }
    
    public static void main(String[] args) {
        
        // try-with-resources автоматически вызывает close()
        try (MyResource resource = new MyResource("CustomResource")) {
            resource.use();
            // При выходе из блока автоматически вызовется resource.close()
        } // close() вызывается здесь автоматически
        
        // Можно объявлять несколько ресурсов
        try (MyResource r1 = new MyResource("First");
             MyResource r2 = new MyResource("Second")) {
            r1.use();
            r2.use();
            // Ресурсы закрываются в обратном порядке создания
        }
        
        // Большинство классов I/O реализуют AutoCloseable:
        try (FileReader reader = new FileReader("test.txt");
             BufferedReader br = new BufferedReader(reader)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            // reader.close() и br.close() вызываются автоматически
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}