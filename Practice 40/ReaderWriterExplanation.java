import java.io.*;

public class ReaderWriterExplanation {
    public static void main(String[] args) throws IOException {
        // Основные отличия и причины существования Reader/Writer:
        
        // InputStream/OutputStream работают с байтами (8-bit)
        // Reader/Writer работают с символами (16-bit Unicode)
        
        // Проблема с байтовыми потоками при работе с текстом:
        FileOutputStream fos = new FileOutputStream("byte_test.txt");
        fos.write("Привет".getBytes()); // Зависит от кодировки по умолчанию
        fos.close();
        
        // Решением будут символьные потоки:
        FileWriter fw = new FileWriter("char_test.txt");
        fw.write("Привет"); // Корректная работа с Unicode
        fw.close();
        
        // Автоматическое преобразование кодировок:
        // Reader/Writer могут конвертировать между байтами и символами
        
        // Пример с разными кодировками:
        System.out.println("Byte stream vs Character stream:");
        
        // Байтовый поток - читает байты как есть
        FileInputStream fis = new FileInputStream("char_test.txt");
        int b;
        System.out.print("Bytes read: ");
        while ((b = fis.read()) != -1) {
            System.out.print(b + " ");
        }
        fis.close();
        System.out.println();
        
        // Символьный поток - читает символы (с учетом кодировки)
        FileReader fr = new FileReader("char_test.txt");
        int c;
        System.out.print("Chars read: ");
        while ((c = fr.read()) != -1) {
            System.out.print((char)c);
        }
        fr.close();
        
        // Мосты между потоками:
        // InputStreamReader - мост от InputStream к Reader
        // OutputStreamWriter - мост от Writer к OutputStream
        
        // Пример с указанием кодировки:
        try (InputStreamReader isr = new InputStreamReader(
                new FileInputStream("char_test.txt"), "UTF-8")) {
            System.out.println("\n\nUsing InputStreamReader with UTF-8");
        }
    }
}