import java.io.*;

public class OutputStreamExample {
    public static void main(String[] args) {
        // Пример использования FileOutputStream.write(int)
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            // Метод write(int b) записывает младший байт указанного int
            String text = "Java I/O Example";
            
            System.out.println("Writing text byte by byte using write(int):");
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                fos.write(c); // Записываем ASCII-код символа
                System.out.print(c + "(" + (int)c + ") ");
            }
            
            fos.write('\n'); // Записываем символ новой строки
            
            // Альтернативный способ записи всего массива
            byte[] data = "\nWritten with write(byte[])".getBytes();
            fos.write(data); // write(byte[] b) - записывает весь массив
            
            // Запись части массива
            byte[] partial = "Partial write".getBytes();
            fos.write(partial, 0, 7); // write(byte[] b, int off, int len)
            
            System.out.println("\n\nFile written successfully!");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}