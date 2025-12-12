import java.io.*;

public class InputStreamExample {
    public static void main(String[] args) {
        // Создаем файл с тестовыми данными
        try (FileOutputStream fos = new FileOutputStream("test.txt")) {
            fos.write("Hello, InputStream!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Пример использования FileInputStream.read()
        try (FileInputStream fis = new FileInputStream("test.txt")) {
            int byteData;
            System.out.println("Reading file byte by byte using read():");
            
            // Метод read() возвращает:
            // - следующий байт данных (0-255)
            // - -1 если достигнут конец потока
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData + "(" + byteData + ") ");
            }
            
            System.out.println("\n\nAlternative reading with buffer:");
            // Переоткрываем поток
            FileInputStream fis2 = new FileInputStream("test.txt");
            byte[] buffer = new byte[10];
            int bytesRead;
            
            // read(byte[] b) - читает до b.length байтов в массив
            while ((bytesRead = fis2.read(buffer)) != -1) {
                System.out.println("Read " + bytesRead + " bytes: " + 
                                 new String(buffer, 0, bytesRead));
            }
            fis2.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}