import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // Создание StringJoiner с разделителем, префиксом и суффиксом
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");
        System.out.println(joiner.toString()); // [Apple, Banana, Cherry]
        
        // Использование для объединения коллекций
        StringJoiner joiner2 = new StringJoiner(" | ");
        joiner2.add("One").add("Two").add("Three");
        System.out.println(joiner2); // One | Two | Three
        
        // StringJoiner с пустым значением по умолчанию
        StringJoiner emptyJoiner = new StringJoiner("-");
        emptyJoiner.setEmptyValue(" a ");
        System.out.println(emptyJoiner); // Пусто
        emptyJoiner.add("A");
        System.out.println(emptyJoiner); // A
    }
}