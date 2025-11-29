public class BooleanCreation {
    public static void main(String[] args) {
        // Все способы создания Boolean
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf("true");
        Boolean b3 = Boolean.valueOf("TRUE");
        Boolean b4 = Boolean.valueOf("False"); // false
        Boolean b5 = true;  // автоупаковка
        
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4 + " " + b5);
        // true true true false true
    }
}