import java.util.*;

public class Generics {
    
    static class Box<T> {
        private T item;
        
        public Box(T item) {
            this.item = item;
        }
        
        public T getItem() {
            return item;
        }
    }
    
    public static void testInstanceOf() {
        System.out.println("=== Практика #1: instanceof ===");
        
        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> integerBox = new Box<>(42);
        
        // 1. Проверка типа контейнера
        System.out.println("stringBox instanceof Box: " + (stringBox instanceof Box)); // true
        
        // 2. Проверка содержимого
        System.out.println("stringBox.getItem() instanceof String: " + 
                          (stringBox.getItem() instanceof String)); // true
        
        // 3. Стирание типов - нельзя проверить параметр типа
        // System.out.println(stringBox instanceof Box<String>); // ОШИБКА компиляции!
        
        // 4. Сырые типы
        Box rawBox = stringBox;
        System.out.println("rawBox instanceof Box: " + (rawBox instanceof Box)); // true
        
        // 5. Проверка элемента коллекции
        List<String> list = Arrays.asList("A", "B");
        System.out.println("list.get(0) instanceof String: " + 
                          (list.get(0) instanceof String)); // true
    }
    
}