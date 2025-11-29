public class NullPointerExample {
    public static void main(String[] args) {
        Integer nullInteger = null;
        
        // Автораспаковка null вызовет NPE
        try {
            int i = nullInteger; // NullPointerException!
        } catch (NullPointerException e) {
            System.out.println("NPE при автораспаковке: " + e.getMessage());
        }
        
        // Арифметика с null тоже вызовет NPE
        try {
            int result = nullInteger + 5; // NullPointerException!
        } catch (NullPointerException e) {
            System.out.println("NPE в арифметике: " + e.getMessage());
        }
    }
}