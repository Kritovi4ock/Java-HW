import java.util.*;

public class Extends {
    
    // <? extends T> - PRODUCER (только чтение)
    static double sumNumbers(List<? extends Number> numbers) {
        double sum = 0;
        for (Number num : numbers) {
            sum += num.doubleValue(); // Можно читать как Number
        }
        return sum;
        // numbers.add(10); // ОШИБКА - нельзя добавлять
    }
    
    // <? super T> - CONSUMER (только запись)
    static void addIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
        // Integer i = list.get(0); // ОШИБКА - можно читать только как Object
    }
    
    // PECS: Copy from Producer to Consumer
    static <T> void copy(List<? extends T> src, List<? super T> dest) {
        for (T item : src) {
            dest.add(item); // Из src читаем, в dest пишем
        }
    }
    
    public static void testExtendsSuper() {
        
        // <? extends Number> пример
        List<Integer> ints = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);
        
        System.out.println("Sum ints: " + sumNumbers(ints));     // OK
        System.out.println("Sum doubles: " + sumNumbers(doubles)); // OK
        
        // <? super Integer> пример
        List<Number> numList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();
        
        addIntegers(numList); // OK - Number super Integer
        addIntegers(objList); // OK - Object super Integer
        
        System.out.println("Number list: " + numList);
        System.out.println("Object list: " + objList);
        
        // Копирование (PECS)
        List<String> source = Arrays.asList("A", "B", "C");
        List<Object> destination = new ArrayList<>();
        copy(source, destination);
        System.out.println("Copied: " + destination);
    }
    
    // Демонстрация ограничений
    static class Wrapper<T extends Number> { // T должен быть Number или его подкласс
        private T value;
        
        public Wrapper(T value) {
            this.value = value;
        }
        
        public double getDouble() {
            return value.doubleValue(); // Можем использовать методы Number
        }
    }
    
    public static void testBounds() {
        
        Wrapper<Integer> intWrapper = new Wrapper<>(10);    // OK
        Wrapper<Double> doubleWrapper = new Wrapper<>(3.14); // OK
        // Wrapper<String> stringWrapper = new Wrapper<>("text"); // ОШИБКА!
        
        System.out.println("Integer as double: " + intWrapper.getDouble());
        System.out.println("Double as double: " + doubleWrapper.getDouble());
    }
    
    public static void main(String[] args) {
        testExtendsSuper();
        testBounds();
    }
}