import java.io.*;

public class FlushExample {
    public static void main(String[] args) throws IOException {
        // Пример с FileWriter (буферизированный вывод)
        FileWriter writer = new FileWriter("output.txt");
        writer.write("First line\n");
        writer.write("Second line\n");
        
        // Данные пока в буфере, не записаны в файл
        writer.flush(); // Принудительная запись из буфера в файл
        System.out.println("Data flushed to file");
        
        writer.write("Third line after flush\n");
        writer.close(); // close() автоматически вызывает flush()
        
        // Пример с PrintStream (System.out буферизирован)
        PrintStream ps = new PrintStream(System.out);
        ps.print("Buffered output...");
        ps.flush(); // Гарантирует немедленный вывод на консоль
        ps.println(" (flushed)");
        
        // Без flush() данные могут задерживаться в буфере
        // Особенно важно для сетевых потоков и логирования в реальном времени
    }
}