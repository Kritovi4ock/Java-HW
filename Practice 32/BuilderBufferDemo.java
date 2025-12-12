public class BuilderBufferDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        // append() — добавление в конец
        sb.append(" World");
        System.out.println(sb); // Hello World
        
        // insert() — вставка по индексу
        sb.insert(5, ",");
        System.out.println(sb); // Hello, World
        
        // delete() — удаление части строки
        sb.delete(5, 7);
        System.out.println(sb); // HelloWorld
        
        // reverse() — обратный порядок символов
        sb.reverse();
        System.out.println(sb); // dlroWolleH
        
        // replace() — замена части строки
        sb.replace(0, 5, "JAVA");
        System.out.println(sb); // JAVAlleH
        
        // capacity() — текущая ёмкость буфера
        System.out.println(sb.capacity());
        
        // length() — длина содержимого
        System.out.println(sb.length());
        
        // setLength() — установка новой длины
        sb.setLength(4);
        System.out.println(sb); // JAVA
        
        // charAt() — получение символа по индексу
        System.out.println(sb.charAt(2)); // V
        
        // substring() — получение подстроки
        System.out.println(sb.substring(1, 3)); // AV
    }
}