public class StringMethodsDemo {
    public static void main(String[] args) {
        String text = "  Java  ";
        String another = "JAVA";
        
        // 1. length() — возвращает длину строки
        System.out.println(text.length());
        
        // 2. trim() — удаляет пробелы в начале и конце строки
        System.out.println(text.trim() + "'");
        
        // 3. toUpperCase() — преобразует все символы в верхний регистр
        System.out.println(text.toUpperCase());
        
        // 4. toLowerCase() — преобразует все символы в нижний регистр
        System.out.println(text.toLowerCase());
        
        // 5. substring(int begin, int end) — возвращает часть строки
        System.out.println(text.substring(5, 12));
        
        // 6. replace(char old, char new) — заменяет символы
        System.out.println(text.replace('a', 'X'));
        
        // 7. equals(Object obj) — сравнивает строки с учётом регистра
        System.out.println(text.trim().equals(another));
        
        // 8. equalsIgnoreCase(String str) — сравнивает без учёта регистра
        System.out.println(text.trim().equalsIgnoreCase(another));
        
        // 9. startsWith(String prefix) — проверяет, начинается ли строка с указанного префикса
        System.out.println(text.trim().startsWith("Java"));
        
        // 10. split(String regex) — разбивает строку на массив по разделителю
        String[] words = text.trim().split(" ");
        for (String word : words) {
            System.out.println("  " + word);
        }
    }
}