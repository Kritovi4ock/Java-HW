import packageA.ClassA;
import packageA.SubClassA;
import packageB.ClassB;
import packageB.SubClassB;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ СПЕЦИФИКАТОРОВ ДОСТУПА ===\n");
        
        // Тестирование внутри ClassA
        ClassA objA = new ClassA();
        objA.showAllFields();
        System.out.println();
        
        // Тестирование подкласса в том же пакете
        SubClassA subA = new SubClassA();
        subA.testAccess();
        System.out.println();
        
        // Тестирование класса в другом пакете
        ClassB objB = new ClassB();
        objB.testAccess();
        System.out.println();
        
        // Тестирование подкласса в другом пакете
        SubClassB subB = new SubClassB();
        subB.testAccess();
    }
}